package grocery.delivery.service.domain;

import grocery.delivery.service.domain.*;
import grocery.delivery.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private List<GroceryItem> items;

    public OrderPlaced(Customer aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
