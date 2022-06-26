package dennnoval.springecommercerest.repository;

import dennnoval.springecommercerest.entity.Cart;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CartRepo extends PagingAndSortingRepository<Cart, Integer> {
}
