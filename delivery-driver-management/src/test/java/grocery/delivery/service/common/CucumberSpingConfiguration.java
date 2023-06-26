package grocery.delivery.service.common;

import grocery.delivery.service.DeliveryDriverManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveryDriverManagementApplication.class })
public class CucumberSpingConfiguration {}
