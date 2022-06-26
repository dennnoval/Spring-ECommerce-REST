package dennnoval.springecommercerest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter @Setter
@Table(name = "Orders")
public class Order implements Serializable {

  @Id
  @GeneratedValue
  private int id;
  @Column(name = "created_at", columnDefinition = "TIMESTAMP")
  private final Date createdAt = new Date();
  @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
  private Date updatedAt;
  private float total;
  @Column(length = 12)
  private String paymentType;
  @Column(length = 12)
  private String status;
  @OneToOne(fetch = FetchType.LAZY)
  private Cart cart;
  @ManyToOne(fetch = FetchType.LAZY)
  private Customer customer;

  public Order(float total, String paymentType, Cart cart, Customer customer) {
    this.total = total;
    this.paymentType = paymentType;
    this.cart = cart;
    this.customer = customer;
  }

  @PrePersist
  public void prePersist() {
    this.status = "pending";
  }

  @PreUpdate
  public void preUpdate() {
    this.updatedAt = new Date();
  }

}
