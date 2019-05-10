/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petshop.entidade;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
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

@Embeddable
public class Address implements Serializable{
    private String country;
    private String street1;
    private String city;
    private String state;
    private String street2;
    private String zipcode;
}
