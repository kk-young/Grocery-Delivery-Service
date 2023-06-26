package grocery.delivery.service.domain;

import grocery.delivery.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "groceryItems",
    path = "groceryItems"
)
public interface GroceryItemRepository
    extends PagingAndSortingRepository<GroceryItem, String> {}
