package com.pwr.controller;

import com.pwr.mappers.ProductBaseMapper;
import com.pwr.model.*;
import com.pwr.repository.CategoryRepository;
import com.pwr.repository.ProductBaseRepository;
import com.pwr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lodwr on 29.05.2017.
 */

@RestController
@RequestMapping(path = "dataInit")
public class DataInit {

    @Autowired
    private ProductBaseRepository productBaseRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ProductBaseEntity createProduct() {
        CategoryEntity ce = new CategoryEntity();
        ce.setName("Mieso");

        ce = categoryRepository.findOne((long)1);


        ProductBaseEntity pbe = new ProductBaseEntity();
        pbe.setCategory(ce);
        pbe.setBaseValidityPeriod(5);
        pbe.setUnits("kg");
        pbe.setName("Kurczak");

        productBaseRepository.save(pbe);

        UserEntity u = new UserEntity();
        u.setName("a");
        u.setPassword("a");

//        userRepository.save(u);

        return pbe;
    }
}
