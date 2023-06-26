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
// @RequestMapping(value="/deliveryDrivers")
@Transactional
public class DeliveryDriverController {

    @Autowired
    DeliveryDriverRepository deliveryDriverRepository;

    @RequestMapping(
        value = "deliveryDrivers/{id}//api/driver/accept-delivery",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public DeliveryDriver acceptDelivery(
        @PathVariable(value = "id") String id,
        @RequestBody AcceptDeliveryCommand acceptDeliveryCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /deliveryDriver/acceptDelivery  called #####"
        );
        Optional<DeliveryDriver> optionalDeliveryDriver = deliveryDriverRepository.findById(
            id
        );

        optionalDeliveryDriver.orElseThrow(() ->
            new Exception("No Entity Found")
        );
        DeliveryDriver deliveryDriver = optionalDeliveryDriver.get();
        deliveryDriver.acceptDelivery(acceptDeliveryCommand);

        deliveryDriverRepository.save(deliveryDriver);
        return deliveryDriver;
    }

    @RequestMapping(
        value = "deliveryDrivers/{id}//api/driver/deliver-order",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public DeliveryDriver deliverOrder(
        @PathVariable(value = "id") String id,
        @RequestBody DeliverOrderCommand deliverOrderCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /deliveryDriver/deliverOrder  called #####");
        Optional<DeliveryDriver> optionalDeliveryDriver = deliveryDriverRepository.findById(
            id
        );

        optionalDeliveryDriver.orElseThrow(() ->
            new Exception("No Entity Found")
        );
        DeliveryDriver deliveryDriver = optionalDeliveryDriver.get();
        deliveryDriver.deliverOrder(deliverOrderCommand);

        deliveryDriverRepository.save(deliveryDriver);
        return deliveryDriver;
    }
}
