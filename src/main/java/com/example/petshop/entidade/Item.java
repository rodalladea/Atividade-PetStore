/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petshop.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
public class Item implements Serializable{
    @Id @GeneratedValue
    private Long id;
    private String description;
    private String name;
    private String imagePath;
    private float unitCost;
    
    
    private Product product;
}
