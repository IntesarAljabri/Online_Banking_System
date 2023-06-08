package Online_Banking_System.MyProject.Services;

import Online_Banking_System.MyProject.Models.Customer;
import Online_Banking_System.MyProject.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
