package grocery.delivery.service.domain;

import grocery.delivery.service.domain.*;
import grocery.delivery.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryAccepted extends AbstractEvent {

    private String orderId;

    public DeliveryAccepted(DeliveryDriver aggregate) {
        super(aggregate);
    }

    public DeliveryAccepted() {
        super();
    }
}
