package com.pwr.controller;

import com.pwr.model.ProductBaseTO;
import com.pwr.model.RequiedProductTO;
import com.pwr.repository.RequiedProductRepository;
import com.pwr.service.IRequiedProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(path = "all", method = RequestMethod.GET)
    @ResponseBody
    public List<RequiedProductTO> findAllRequiedProducts() {
        return requiedProductService.findAllRequiedProducts();
    }
}
