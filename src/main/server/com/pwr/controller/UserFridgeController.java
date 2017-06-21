package com.pwr.controller;

import com.pwr.model.ProductBaseTO;
import com.pwr.model.ProductTO;
import com.pwr.model.UserTO;
import com.pwr.repository.UserFridgeRepository;
import com.pwr.service.IUserFridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
@RestController
@RequestMapping(path = "/services/userFridge")
public class UserFridgeController {

    @Autowired
    private IUserFridgeService userFridgeService;
    @Autowired
    private UserFridgeRepository userFridgeRepository;

    @CrossOrigin
    @RequestMapping(path = "getContent", method = RequestMethod.GET)
    @ResponseBody
    public List<ProductTO> findAllUsers(
            @RequestParam("login") String login
    ) {
        return userFridgeService.getFridgeContent(login);
    }

    @CrossOrigin
    @RequestMapping(path = "setContent", method = RequestMethod.PUT)
    @ResponseBody
    public void updateContent(
            @RequestParam("login") String login,
            @RequestBody List<ProductTO> products
    ) {
        userFridgeService.setFridgeContent(products, login);
    }
}
