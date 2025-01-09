package vttp.paf.day1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp.paf.day1.model.Customer;
import vttp.paf.day1.repository.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){

        return customerRepository.getCustomers();
    }

    public List<Customer> getCustomers(int limit, int offset){

        return customerRepository.getCustomers(limit, offset);
    }
}
