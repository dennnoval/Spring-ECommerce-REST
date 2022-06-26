package dennnoval.springecommercerest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter @Setter
public class CartItem implements Serializable {

  @Id
  @GeneratedValue
  private int id;
  @OneToOne(fetch = FetchType.LAZY)
  private Product product;
  @Column(length = 3)
  private int quantity;
  private float total;
  @ManyToOne(fetch = FetchType.LAZY)
  private Cart cart;

  public CartItem(Product product, int quantity, Cart cart) {
    this.product = product;
    this.quantity = quantity;
    this.total = product.getPrice() * quantity;
    this.cart = cart;
  }

  protected void setTotal(float price, int quantity) {
    this.total = price * quantity;
  }

  @PreUpdate
  public void preUpdate() {
    setTotal(product.getPrice() * quantity);
  }

}
