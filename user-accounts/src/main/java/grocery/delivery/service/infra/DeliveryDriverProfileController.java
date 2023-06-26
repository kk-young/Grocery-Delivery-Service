package grocery.delivery.service.infra;

import grocery.delivery.service.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/deliveryDriverProfiles")
@Transactional
public class DeliveryDriverProfileController {

    @Autowired
    DeliveryDriverProfileRepository deliveryDriverProfileRepository;
}
