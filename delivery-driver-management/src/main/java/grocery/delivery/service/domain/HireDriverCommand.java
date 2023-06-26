package grocery.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class HireDriverCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String name;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String email;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String driverLicenseNumber;
}
