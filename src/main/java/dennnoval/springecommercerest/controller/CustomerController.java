package dennnoval.springecommercerest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/customer")
public class CustomerController {

  @PatchMapping("/edit")
  public ResponseEntity<Object> edit() {
    return ResponseEntity.status(202).build();
  }

}
