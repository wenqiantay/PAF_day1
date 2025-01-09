package vttp.paf.day1.Restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
