package grocery.delivery.service.domain;

import grocery.delivery.service.domain.*;
import grocery.delivery.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryTimeSpecified extends AbstractEvent {

    private String time;

    public DeliveryTimeSpecified(Customer aggregate) {
        super(aggregate);
    }

    public DeliveryTimeSpecified() {
        super();
    }
}
