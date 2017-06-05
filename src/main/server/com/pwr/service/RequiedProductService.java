package com.pwr.service;

import com.pwr.mappers.RequiedProductMapper;
import com.pwr.model.RequiedProductTO;
import com.pwr.repository.RequiedProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magda Zielonka on 19.05.2017.
 */
@Service
public class RequiedProductService implements IRequiedProductService {

    @Autowired
    private RequiedProductRepository requiedProductRepository;

    @Autowired
    public List<RequiedProductTO> findAllRequiedProducts() {
        List<RequiedProductTO> result = new ArrayList<RequiedProductTO>();
        requiedProductRepository.findAll().forEach(requiedProductEntity ->
        result.add(RequiedProductMapper.mapRequiedProduct(requiedProductEntity)));
        return result;
    }

}
