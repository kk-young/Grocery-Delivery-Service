package grocery.delivery.service.domain;

import grocery.delivery.service.domain.*;
import grocery.delivery.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DriverScheduled extends AbstractEvent {

    private String email;
    private String dayOfWeek;
    private String startTime;
    private String endTime;

    public DriverScheduled(DeliveryDriver aggregate) {
        super(aggregate);
    }

    public DriverScheduled() {
        super();
    }
}
