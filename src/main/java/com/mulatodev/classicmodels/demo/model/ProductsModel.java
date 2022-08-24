/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mulatodev.classicmodels.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author gustnabe
 */
@Entity
@Table(name = "products")
public class ProductsModel {
 
    @Id
    @Column(name = "productcode", unique = true, nullable = false)
    private String productCode; 
    
    protected ProductsModel(){}
    
    public String getProductoCode(){
        return productCode;
    }
}
