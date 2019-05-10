/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petshop.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author gabrielgarcia
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Customer implements Serializable{
    @Id @GeneratedValue
    private Long id;
    
    private String password;
    private String email;
    private String lastname;
    private String firstname;
    private String login;
    private String telephone;
    private int age;
    
    @DateTimeFormat
    private Date dateOfBirth;
    
    @OneToOne
    private Address homeAddress;
        
}
