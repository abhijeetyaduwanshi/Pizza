/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.model.Customer;
import com.mycompany.repository.CustomerRepository;
import com.mycompany.repository.simple.SimpleCustomerRepositoryImpl;
import java.util.Collection;

/**
 *
 * @author ayaduwanshi
 */
public class CrmServiceImpl implements CrmService {

    private CustomerRepository customerRepository = new SimpleCustomerRepositoryImpl();
    
    @Override
    public Collection<Customer> findCustomers() {
        return customerRepository.findAll();
    }
    
}
