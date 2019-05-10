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
public class CreditCard implements Serializable{
    private String creditCardExpDate;
    private CreditCardType creditCardType;
    private String creditCardNumber;
}
