/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repository.simple;

import com.mycompany.model.Customer;
import com.mycompany.repository.CustomerRepository;
import com.mycompany.util.RandomName;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author ayaduwanshi
 */
public class SimpleCustomerRepositoryImpl implements CustomerRepository {

    private final Map<Long, Customer> customers = Collections.synchronizedMap(createCustomerMap());

    public SimpleCustomerRepositoryImpl() {
    }

    private Map<Long, Customer> createCustomerMap() {
        SortedMap<Long, Customer> ret = new TreeMap();

        for(int i = 1; i <= 50; i++) {
            Customer customer = new Customer();
            customer.setCustomerId(new Long(i));
            customer.setFirstName(RandomName.generateFirstName());
            customer.setLastName(RandomName.generateLastName());

            // do the same for rest of the fields
            // customer.setFirstName("Abhijeet");
            // customer.setLastName("Yaduwanshi");
            // customer.setEmail("abhi@gmail.com");
            // customer.setAddress1("123 S State Street");
            // customer.setAddress2("Apt 1234");
            // customer.setCity("Chicago");
            // customer.setState("IL");
            // customer.setZip(48108);
            // customer.setPhone("9876543210");
            ret.put(customer.getCustomerId(), customer);
        }
        return ret;
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer findById(Long id) {
        return customers.get(id);
    }

    @Override
    public void save(Customer customer) {
        if(customer != null) {
            customers.put(customer.getCustomerId(), customer);
        }
    }
}
