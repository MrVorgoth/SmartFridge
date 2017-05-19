package com.pwr.controller;

import com.pwr.repository.UserFridgeRepository;
import com.pwr.service.IUserFridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
@RestController
@RequestMapping(path = "userFridge")
public class UserFridgeController {

    @Autowired
    private IUserFridgeService userFridgeService;
    @Autowired
    private UserFridgeRepository userFridgeRepository;
}
