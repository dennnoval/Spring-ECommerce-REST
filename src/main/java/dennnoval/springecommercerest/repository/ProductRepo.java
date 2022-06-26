package dennnoval.springecommercerest.repository;

import dennnoval.springecommercerest.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepo extends PagingAndSortingRepository<Product, Integer> {
}
