package com.pwr.controller;

import com.pwr.model.RequiedProductTO;
import com.pwr.repository.RequiedProductRepository;
import com.pwr.service.IRequiedProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ania on 04.06.2017.
 */
@RestController
@RequestMapping(path = "requiedProduct")
public class RequiedProductController {

    @Autowired
    private IRequiedProductService requiedProductService;
    @Autowired
    private RequiedProductRepository requiedProductRepository;

    @RequestMapping(path = "create", method = RequestMethod.GET)
    @ResponseBody
    public String createRequiedProd(@RequestParam("quantity") int quantity){
        requiedProductService.createRequiedProd(quantity);

        return "OK";
    }

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<RequiedProductTO> findAllRequiedProd(){
        return requiedProductService.findAllRequiedProd();
    }
}
