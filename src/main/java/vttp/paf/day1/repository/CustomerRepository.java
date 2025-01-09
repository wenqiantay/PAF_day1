package vttp.paf.day1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import vttp.paf.day1.model.Customer;
import vttp.paf.day1.utils.sql;

@Repository
public class CustomerRepository {
    
    @Autowired
    JdbcTemplate template;

    public List<Customer> getCustomers(){
        
        List<Customer> customers = new ArrayList<>();

        SqlRowSet sqlRowSet = template.queryForRowSet(sql.sql_getAllCustomers);

        while(sqlRowSet.next()){
            Customer c = new Customer(sqlRowSet.getInt("id"), sqlRowSet.getString("fullname"), sqlRowSet.getString("email"));

            customers.add(c);
        }

        return customers;
    }
}
