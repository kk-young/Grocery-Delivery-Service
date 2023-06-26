package grocery.delivery.service.domain;

import grocery.delivery.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "deliveryDrivers",
    path = "deliveryDrivers"
)
public interface DeliveryDriverRepository
    extends PagingAndSortingRepository<DeliveryDriver, String> {}
