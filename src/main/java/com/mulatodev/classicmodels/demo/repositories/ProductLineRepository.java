/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mulatodev.classicmodels.demo.repositories;

import com.mulatodev.classicmodels.demo.model.ProductLineModel;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author gustnabe
 */
public interface ProductLineRepository extends CrudRepository<ProductLineModel, String>{
    
}
