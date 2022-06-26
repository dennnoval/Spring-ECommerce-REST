package dennnoval.springecommercerest.controller;

import dennnoval.springecommercerest.entity.Cart;
import dennnoval.springecommercerest.entity.Order;
import dennnoval.springecommercerest.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

  @Autowired
  private OrderRepo orderRepo;

  @PostMapping("/order/checkout")
  public ResponseEntity<Object> checkout(@RequestBody Map<String, Object> json) {
    return ResponseEntity.status(200).build();
  }

  @PatchMapping("/order/cancel")
  public ResponseEntity<Object> cancel() {
    return ResponseEntity.status(202).build();
  }

}
