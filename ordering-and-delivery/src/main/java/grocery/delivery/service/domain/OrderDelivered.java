package grocery.delivery.service.domain;

import grocery.delivery.service.domain.*;
import grocery.delivery.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderDelivered extends AbstractEvent {

    private String orderId;

    public OrderDelivered(DeliveryDriver aggregate) {
        super(aggregate);
    }

    public OrderDelivered() {
        super();
    }
}
