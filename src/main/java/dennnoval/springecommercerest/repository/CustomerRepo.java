package dennnoval.springecommercerest.repository;

import dennnoval.springecommercerest.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepo extends PagingAndSortingRepository<Customer, String> {
}
