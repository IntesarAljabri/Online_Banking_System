package Online_Banking_System.MyProject.Controllers;
import Online_Banking_System.MyProject.Models.Customer;
import Online_Banking_System.MyProject.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping(value = "getAll")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }//    }//http://localhost:8080/customers/getAll

}
