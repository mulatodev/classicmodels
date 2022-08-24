/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mulatodev.classicmodels.demo.controller;

import java.util.ArrayList;

import com.mulatodev.classicmodels.demo.services.ProductsService;
import com.mulatodev.classicmodels.demo.model.ProductsModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gustnabe
 */
@RestController
@RequestMapping("/Products")
public class ProductsController {
    
    @Autowired
    ProductsService productService;
    
    @GetMapping()
    public ArrayList<ProductsModel> getProducts(){
        return (ArrayList<ProductsModel>) productService.getProducts();
    }
}
