package grocery.delivery.service.domain;

import grocery.delivery.service.DeliveryDriverManagementApplication;
import grocery.delivery.service.domain.DriverHired;
import grocery.delivery.service.domain.DriverScheduled;
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

    private String driverLicenseNumber;

    @PostPersist
    public void onPostPersist() {
        DriverHired driverHired = new DriverHired(this);
        driverHired.publishAfterCommit();

        DriverScheduled driverScheduled = new DriverScheduled(this);
        driverScheduled.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryDriverRepository repository() {
        DeliveryDriverRepository deliveryDriverRepository = DeliveryDriverManagementApplication.applicationContext.getBean(
            DeliveryDriverRepository.class
        );
        return deliveryDriverRepository;
    }

    public void scheduleDriver(ScheduleDriverCommand scheduleDriverCommand) {
        //implement business logic here:

    }
}
