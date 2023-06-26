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
// @RequestMapping(value="/customers")
@Transactional
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping(
        value = "customers/{id}//api/customer/delivery-time",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Customer specifyDeliveryTime(
        @PathVariable(value = "id") String id,
        @RequestBody SpecifyDeliveryTimeCommand specifyDeliveryTimeCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /customer/specifyDeliveryTime  called #####");
        Optional<Customer> optionalCustomer = customerRepository.findById(id);

        optionalCustomer.orElseThrow(() -> new Exception("No Entity Found"));
        Customer customer = optionalCustomer.get();
        customer.specifyDeliveryTime(specifyDeliveryTimeCommand);

        customerRepository.save(customer);
        return customer;
    }
}
