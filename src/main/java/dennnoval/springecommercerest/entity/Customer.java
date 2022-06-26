package dennnoval.springecommercerest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer implements Serializable {

  @Id
  @Column(length = 24)
  private String username;
  @Column(length = 64)
  private String password;
  @Column(length = 48)
  private String fullname;
  private String address;
  @Column(length = 13)
  private String phone;
  @Column(length = 24)
  private String email;

}
