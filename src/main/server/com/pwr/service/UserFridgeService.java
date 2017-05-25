package com.pwr.service;

import com.pwr.repository.UserFridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Magda Zielonka on 19.05.2017.
 */
@Service
public class UserFridgeService implements IUserFridgeService {

    @Autowired
    private UserFridgeRepository userFridgeRepository;
}
