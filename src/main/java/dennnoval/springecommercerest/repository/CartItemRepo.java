package dennnoval.springecommercerest.repository;

import dennnoval.springecommercerest.entity.CartItem;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CartItemRepo extends PagingAndSortingRepository<CartItem, Integer> {
}
