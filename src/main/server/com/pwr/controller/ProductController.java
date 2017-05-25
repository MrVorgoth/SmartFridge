package com.pwr.controller;

import com.pwr.repository.ProductRepository;
import com.pwr.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
@RestController
@RequestMapping(path = "product")
public class ProductController {

    @Autowired
    private IProductService productService;
    @Autowired
    private ProductRepository productRepository;
}
