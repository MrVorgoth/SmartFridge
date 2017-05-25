package com.pwr.controller;

import com.pwr.repository.RequiedProductRepository;
import com.pwr.service.IRequiedProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
@RestController
@RequestMapping(path = "requiedProduct")
public class RequiedProductController {

    @Autowired
    private IRequiedProductService requiedProductService;
    @Autowired
    private RequiedProductRepository requiedProductRepository;
}
