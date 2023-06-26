package grocery.delivery.service.common;

import grocery.delivery.service.OrderingAndDeliveryApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderingAndDeliveryApplication.class })
public class CucumberSpingConfiguration {}
