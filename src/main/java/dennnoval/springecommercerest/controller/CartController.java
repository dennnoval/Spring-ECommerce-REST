package dennnoval.springecommercerest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cart")
public class CartController {

  @PostMapping("/add")
  public ResponseEntity<Object> add() {
    return ResponseEntity.status(200).build();
  }

  @PatchMapping("/remove")
  public ResponseEntity<Object> remove() {
    return ResponseEntity.status(202).build();
  }

}
