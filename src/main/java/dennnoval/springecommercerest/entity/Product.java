package dennnoval.springecommercerest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Product implements Serializable {

  @Id
  @GeneratedValue
  private int id;
  @Column(length = 16)
  private String name;
  private float price;
  private int stock;

  public Product(String name, float price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

}
