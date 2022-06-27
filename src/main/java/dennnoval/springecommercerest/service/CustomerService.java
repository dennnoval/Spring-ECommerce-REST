package dennnoval.springecommercerest.service;

import dennnoval.springecommercerest.entity.*;
import dennnoval.springecommercerest.repository.*;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CustomerService implements CustomerServiceInterface {

  private Customer customer;

  @Getter
  private Cart cart;

  @Getter
  private Order order;

  @Autowired
  private CustomerRepo customerRepo;

  @Autowired
  private ProductRepo productRepo;

  @Autowired
  private OrderRepo orderRepo;

  @Autowired
  private CartItemRepo cartItemRepo;

  @Autowired
  private CartRepo cartRepo;

  public void setCustomerId(String id) {
    this.customer = customerRepo.findById(id).get();
  }

  @Override
  public List<Product> getProductList() {
    return StreamSupport.stream(productRepo.findAll().spliterator(), false)
      .collect(Collectors.toList());
  }

  @Override
  public List<Order> getOrderList() {
    return StreamSupport.stream(orderRepo.findAllByCustomerUsername(customer.getUsername()), false)
      .collect(Collectors.toList());
  }

  @Override
  public void orderProduct(Product product, int quantity) {
    if (cart == null) cart = new Cart(customer);
    CartItem ci = new CartItem(product, quantity, cart);
    cartItemRepo.save(ci);
  }

  @Override
  public void checkoutOrder() {
    if (cart != null) {
      order = new Order(0, "COD", cart, customer);
      orderRepo.save(order);
      cartRepo.delete(cart);
      cart = null;
    }
  }

  @Override
  public void cancelOrder() {
    orderRepo.delete(order);
  }

  @Override
  public void editProfile(Customer customer) {
    customerRepo.save(customer);
  }

}
