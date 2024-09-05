package pocSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pocSpringBoot.domain.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(123, "juan", "galatico", "123")
    ));

    @GetMapping("clientes")
    public List<Customer> getCustomers() {
        return customers;
    }
}
