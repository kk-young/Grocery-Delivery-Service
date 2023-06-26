package grocery.delivery.service.domain;

import grocery.delivery.service.OrderingAndDeliveryApplication;
import grocery.delivery.service.domain.DeliveryTimeSpecified;
import grocery.delivery.service.domain.OrderPlaced;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Customer_table")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private String email;

    private String deliveryAddress;

    private String deliveryTime;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

        DeliveryTimeSpecified deliveryTimeSpecified = new DeliveryTimeSpecified(
            this
        );
        deliveryTimeSpecified.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CustomerRepository repository() {
        CustomerRepository customerRepository = OrderingAndDeliveryApplication.applicationContext.getBean(
            CustomerRepository.class
        );
        return customerRepository;
    }

    public void specifyDeliveryTime(
        SpecifyDeliveryTimeCommand specifyDeliveryTimeCommand
    ) {
        //implement business logic here:

    }
}
