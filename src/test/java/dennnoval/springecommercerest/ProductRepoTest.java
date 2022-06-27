package dennnoval.springecommercerest;

import dennnoval.springecommercerest.repository.ProductRepo;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.StreamSupport;

// @SpringBootTest
public class ProductRepoTest {

  @Autowired
  private ProductRepo productRepo;

  // @Test
  void getListSize_whenInitializedWithSizeGreaterThanZero_returnTrue() {
    long size1 = productRepo.count();
    System.out.println(size1);
    assertThat(size1).isGreaterThan(0);

    long size2 = StreamSupport.stream(productRepo.findAll().spliterator(), false).count();
    System.out.printf("%s%n", size2);
    assertThat(size2).isGreaterThan(0);

  }

}
