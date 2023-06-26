package grocery.delivery.service.domain;

import grocery.delivery.service.domain.*;
import grocery.delivery.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DriverHired extends AbstractEvent {

    private String email;

    public DriverHired(DeliveryDriver aggregate) {
        super(aggregate);
    }

    public DriverHired() {
        super();
    }
}
