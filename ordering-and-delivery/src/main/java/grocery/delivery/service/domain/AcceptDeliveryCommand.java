package grocery.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class AcceptDeliveryCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String orderId;
}
