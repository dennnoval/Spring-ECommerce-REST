package dennnoval.springecommercerest.service;

import dennnoval.springecommercerest.entity.Cart;
import dennnoval.springecommercerest.entity.Customer;
import dennnoval.springecommercerest.entity.Order;
import dennnoval.springecommercerest.entity.Product;

import java.util.List;

public interface CustomerServiceInterface {

  List<Product> getProductList();

  List<Order> getOrderList();

  void orderProduct(Product product, int quantity);

  void checkoutOrder();

  void cancelOrder();

  void editProfile(Customer customer);

}
