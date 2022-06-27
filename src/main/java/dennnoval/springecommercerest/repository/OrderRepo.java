package dennnoval.springecommercerest.repository;

import dennnoval.springecommercerest.entity.Order;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Spliterator;

@RepositoryRestResource
public interface OrderRepo extends PagingAndSortingRepository<Order, Integer> {

  Spliterator<Order> findAllByCustomerUsername(String username);

}
