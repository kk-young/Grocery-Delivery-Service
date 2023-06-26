package grocery.delivery.service.domain;

import grocery.delivery.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "deliveryDriverProfiles",
    path = "deliveryDriverProfiles"
)
public interface DeliveryDriverProfileRepository
    extends PagingAndSortingRepository<DeliveryDriverProfile, String> {}
