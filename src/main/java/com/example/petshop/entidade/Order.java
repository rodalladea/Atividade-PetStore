/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petshop.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author gabrielgarcia
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Order implements Serializable{
    @Id @GeneratedValue
    private Long id;
    
    @OneToOne
    private CreditCard creditCard;
    private Date orderDate;
    
    @OneToMany
    private CreditCardType creditCardType;
    
    private String creditCardNumber;
    
    @OneToMany
    private Set<OrderLine> orderLines;
    
    private float total;
    private String creditCardExpiryDate;

    @OneToOne
    private Customer customer;
    
    @OneToOne
    private Address deliveryAddress;
}
