package bookstore.bookstoreapi_4.controller;

import bookstore.bookstoreapi_4.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final List<Customer> customers = new ArrayList<>();

    // POST /customers - Create a new customer
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return customer;
    }

    // POST /customers/register - Register a new customer using form data
    @PostMapping("/register")
    public Customer registerCustomer(@RequestParam String name,
                                     @RequestParam String email,
                                     @RequestParam String address) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setAddress(address);
        customers.add(customer);
        return customer;
    }

    // GET /customers - Retrieve all customers
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customers;
    }


}
