package vttp.paf.day1.Restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vttp.paf.day1.model.Customer;
import vttp.paf.day1.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {
    
    @Autowired
    CustomerService customerService;

    @GetMapping("")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        
        List<Customer> customers = customerService.getAllCustomers();

        return ResponseEntity.ok().body(customers);
    }

    @GetMapping("/limit")
    public ResponseEntity<List<Customer>> getCustomerByLimitOffset(@RequestParam("limit") int limit, @RequestParam("offset") int offset){

        List<Customer> customers = customerService.getCustomers(limit, offset);

        return ResponseEntity.ok().body(customers);
    }

    @GetMapping("/{customer-id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("customer-id") Integer id){

        Customer customer = customerService.getCustomerById(id);

        return ResponseEntity.ok().body(customer);
    }
}
