package grocery.delivery.service.domain;

import grocery.delivery.service.UserAccountsApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DeliveryDriverProfile_table")
@Data
public class DeliveryDriverProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private String email;

    private String driverLicenseNumber;

    public static DeliveryDriverProfileRepository repository() {
        DeliveryDriverProfileRepository deliveryDriverProfileRepository = UserAccountsApplication.applicationContext.getBean(
            DeliveryDriverProfileRepository.class
        );
        return deliveryDriverProfileRepository;
    }
}
