package dennnoval.springecommercerest;

import dennnoval.springecommercerest.entity.Customer;
import dennnoval.springecommercerest.entity.Product;
import dennnoval.springecommercerest.repository.CustomerRepo;
import dennnoval.springecommercerest.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CustomerServiceTest {

  @Autowired
  private CustomerService customerService;

  @Autowired
  private CustomerRepo customerRepo;

  /*@Test
  void getProductList_whenInitializedWithNotNullList_returnNotNull() {
    List<Product> products = customerService.getProductList();
    System.out.println(products.size());
    assertThat(products).isNotNull();
  }*/

  @Test
  void instatiateService_whenInitializedWithConstructor_returnNotNull() {
    Customer c = customerRepo.findById("jane01").get();
    customerService.setCustomerId(c.getUsername());
    List<Product> products = customerService.getProductList();
    System.out.println(products.size());
    assertThat(customerService).isNotNull();
  }

}
