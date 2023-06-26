package grocery.delivery.service.domain;

import grocery.delivery.service.OrderingAndDeliveryApplication;
import grocery.delivery.service.domain.DeliveryAccepted;
import grocery.delivery.service.domain.OrderDelivered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DeliveryDriver_table")
@Data
public class DeliveryDriver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private String email;

    @PostPersist
    public void onPostPersist() {
        DeliveryAccepted deliveryAccepted = new DeliveryAccepted(this);
        deliveryAccepted.publishAfterCommit();

        OrderDelivered orderDelivered = new OrderDelivered(this);
        orderDelivered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryDriverRepository repository() {
        DeliveryDriverRepository deliveryDriverRepository = OrderingAndDeliveryApplication.applicationContext.getBean(
            DeliveryDriverRepository.class
        );
        return deliveryDriverRepository;
    }

    public void acceptDelivery(AcceptDeliveryCommand acceptDeliveryCommand) {
        //implement business logic here:

    }

    public void deliverOrder(DeliverOrderCommand deliverOrderCommand) {
        //implement business logic here:

    }
}
