package grocery.delivery.service.infra;

import grocery.delivery.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Customer>> {

    @Override
    public EntityModel<Customer> process(EntityModel<Customer> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "//api/customer/delivery-time"
                )
                .withRel("/api/customer/delivery-time")
        );

        return model;
    }
}
