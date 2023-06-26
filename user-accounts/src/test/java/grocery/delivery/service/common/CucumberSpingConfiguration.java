package grocery.delivery.service.common;

import grocery.delivery.service.UserAccountsApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserAccountsApplication.class })
public class CucumberSpingConfiguration {}
