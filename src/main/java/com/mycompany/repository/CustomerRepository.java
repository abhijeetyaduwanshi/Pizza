/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repository;

import com.mycompany.model.Customer;
import java.util.Collection;

/**
 *
 * @author ayaduwanshi
 */
public interface CustomerRepository {
    Collection<Customer> findAll();
    Customer findById(Long id);
    void save(Customer customer);
}
