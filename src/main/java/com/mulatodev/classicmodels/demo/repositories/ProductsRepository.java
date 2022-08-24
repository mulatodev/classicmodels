/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mulatodev.classicmodels.demo.repositories;

import com.mulatodev.classicmodels.demo.model.ProductsModel;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author gustnabe
 */
public interface ProductsRepository extends CrudRepository<ProductsModel, String>{
    
}
