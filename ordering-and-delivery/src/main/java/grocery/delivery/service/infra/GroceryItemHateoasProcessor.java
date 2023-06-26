package grocery.delivery.service.infra;

import grocery.delivery.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class GroceryItemHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<GroceryItem>> {

    @Override
    public EntityModel<GroceryItem> process(EntityModel<GroceryItem> model) {
        return model;
    }
}
