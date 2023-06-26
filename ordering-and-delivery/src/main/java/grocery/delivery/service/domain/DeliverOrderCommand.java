package grocery.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class DeliverOrderCommand {

    private String orderId;
}
