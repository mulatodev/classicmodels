/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mulatodev.classicmodels.demo.services;

import java.util.ArrayList;

import com.mulatodev.classicmodels.demo.repositories.ProductLineRepository;
import com.mulatodev.classicmodels.demo.model.ProductLineModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gustnabe
 */
@Service
public class ProductLineService {

    @Autowired
    ProductLineRepository productLineRepository;
    
    public ArrayList<ProductLineModel> getProductLines(){
        return (ArrayList<ProductLineModel>) productLineRepository.findAll();
    }
}
