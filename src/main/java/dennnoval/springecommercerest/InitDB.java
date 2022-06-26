package dennnoval.springecommercerest;

import dennnoval.springecommercerest.entity.*;
import dennnoval.springecommercerest.repository.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Log4j2
// @Configuration
public class InitDB {

  // @Bean
  CommandLineRunner initDatabase(CustomerRepo cr, ProductRepo pr, CartRepo car, CartItemRepo cir, OrderRepo or) {
    return args -> {
      log.info("Database Initialization...");

      Customer c = new Customer("jane01", "pass123", "Jane Doe", "Beverly Hills St.", "55278432", "jane@email.com");
      cr.save(c);

      Product p1 = new Product("Product 1", 5.0f, 10);
      pr.save(p1);
      Product p2 = new Product("Product 2", 7.0f, 8);
      pr.save(p2);

      Cart ca = new Cart(c);
      car.save(ca);

      // Customer making order
      CartItem ci1 = new CartItem(p1, 2, ca);
      cir.save(ci1);
      CartItem ci2 = new CartItem(p2, 1, ca);
      cir.save(ci2);
      float total = 0;
      total += ci1.getTotal();
      total += ci2.getTotal();

      Order o = new Order(total, "TF", ca, c);
      or.save(o);

      p1.setStock(p1.getStock() - ci1.getQuantity());
      pr.save(p1);
      p2.setStock(p2.getStock() - ci2.getQuantity());
      pr.save(p2);

      log.info("Finish.");
    };
  }

}
