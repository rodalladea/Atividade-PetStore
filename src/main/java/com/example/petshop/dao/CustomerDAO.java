/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petshop.dao;

import com.example.petshop.entidade.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gabrielgarcia
 */
public interface CustomerDAO extends JpaRepository<Customer, Long> {
    
}
