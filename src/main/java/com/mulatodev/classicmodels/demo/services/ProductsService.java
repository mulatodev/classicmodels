/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mulatodev.classicmodels.demo.services;

import java.util.ArrayList;

import com.mulatodev.classicmodels.demo.model.ProductsModel;
import com.mulatodev.classicmodels.demo.repositories.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gustnabe
 */
@Service
public class ProductsService {
    
    @Autowired
    ProductsRepository productsRepository;
    
    public ArrayList<ProductsModel> getProducts(){
        return (ArrayList<ProductsModel>) productsRepository.findAll();
    }
}
