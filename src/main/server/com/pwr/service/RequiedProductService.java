package com.pwr.service;

import com.pwr.repository.RequiedProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Magda Zielonka on 19.05.2017.
 */
@Service
public class RequiedProductService implements IRequiedProductService {

    @Autowired
    private RequiedProductRepository requiedProductRepository;
}
