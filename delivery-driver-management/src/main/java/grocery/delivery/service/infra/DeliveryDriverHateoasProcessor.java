package grocery.delivery.service.infra;

import grocery.delivery.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DeliveryDriverHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<DeliveryDriver>> {

    @Override
    public EntityModel<DeliveryDriver> process(
        EntityModel<DeliveryDriver> model
    ) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "//api/driver/schedule"
                )
                .withRel("/api/driver/schedule")
        );

        return model;
    }
}
