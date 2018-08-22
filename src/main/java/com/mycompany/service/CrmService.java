/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.model.Customer;

import java.util.Collection;

/**
 *
 * @author ayaduwanshi
 */
public interface CrmService {
    Collection<Customer> findCustomers();
}
