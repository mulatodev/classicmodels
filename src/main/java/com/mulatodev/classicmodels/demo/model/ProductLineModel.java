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
@Table(name = "productlines")
public class ProductLineModel {
    
    @Id
    @Column(name = "productline", unique = true, nullable = false)
    private String productLine;
    @Column(name = "textdescription", nullable = true)
    private String textDescription;
    @Column(name = "htmldescription")
    private String htmlDescription;
    @Column(name = "image")
    private byte[] image;
    
    protected ProductLineModel(){}
    
    public String getProductLine(){
        return productLine;
    }
    
    public String getTextDescription(){
        return textDescription;
    }
    
    public String getHtmlDescription(){
        return htmlDescription;
    }
    
    public byte[] getImage(){
        return image;
    }
}
