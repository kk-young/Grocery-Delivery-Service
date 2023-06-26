package grocery.delivery.service.infra;

import grocery.delivery.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DeliveryDriverProfileHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<DeliveryDriverProfile>> {

    @Override
    public EntityModel<DeliveryDriverProfile> process(
        EntityModel<DeliveryDriverProfile> model
    ) {
        return model;
    }
}
