package dennnoval.springecommercerest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Cart implements Serializable {

  @Id
  @GeneratedValue
  private int id;
  @Column(name = "created_at", columnDefinition = "TIMESTAMP")
  private final Date createdAt = new Date();
  @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
  private Date updatedAt;
  @OneToOne(fetch = FetchType.LAZY)
  @JsonIgnore
  private Customer customer;

  public Cart(Customer customer) {
    this.customer = customer;
  }

  @PreUpdate
  public void preUpdate() {
    this.updatedAt = new Date();
  }

}
