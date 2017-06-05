package com.pwr.service;

import com.pwr.mappers.RequiedProductMapper;
import com.pwr.model.RequiedProductEntity;
import com.pwr.model.RequiedProductTO;
import com.pwr.repository.RequiedProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ania on 04.06.2017.
 */
@Service
public class RequiedProductService implements IRequiedProductService {

    @Autowired
    private RequiedProductRepository requiedProductRepository;

    @Override
    public List<RequiedProductTO> findAllRequiedProd() {
        List<RequiedProductTO> result = new ArrayList<RequiedProductTO>();
        requiedProductRepository.findAll().forEach(requiedProduct -> result.add(RequiedProductMapper.mapRequiedProduct(requiedProduct)));
        return result;
    }

    @Override
    public void createRequiedProd(int quantity) {
        RequiedProductEntity requiedProductEntity = new RequiedProductEntity();
        requiedProductEntity.setQuantity(quantity);

        requiedProductRepository.save(requiedProductEntity);

    }
}
