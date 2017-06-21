package com.pwr.service;

import com.pwr.mappers.ProductMapper;
import com.pwr.model.ProductEntity;
import com.pwr.model.ProductTO;
import com.pwr.model.UserEntity;
import com.pwr.model.UserFridgeEntity;
import com.pwr.repository.ProductRepository;
import com.pwr.repository.UserFridgeRepository;
import com.pwr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magda Zielonka on 19.05.2017.
 */
@Service
public class UserFridgeService implements IUserFridgeService {

    @Autowired
    private UserFridgeRepository userFridgeRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductTO> getFridgeContent(String login) {

        UserEntity userEntity = null;
        UserFridgeEntity fridge = null;
        try {
            userEntity = userRepository.findByLogin(login).get(0);
            fridge = userFridgeRepository.findByUserId(userEntity.getId());
        }catch ( IndexOutOfBoundsException e) {
            fridge = new UserFridgeEntity();
            fridge.setUser(userEntity);
            userFridgeRepository.save(fridge);
            return new ArrayList<ProductTO>();
        }

        List<ProductTO> products = new ArrayList<ProductTO>();
        if(fridge == null) {
            return products;
        }
        for(ProductEntity product : fridge.getProduts()) {
            products.add(ProductMapper.mapProduct(product));
        }

        return products;
    }

    @Override
    public void setFridgeContent(List<ProductTO> products, String login) {
        UserEntity userEntity = userRepository.findByLogin(login).get(0);
        UserFridgeEntity fridge = userFridgeRepository.findByUserId(userEntity.getId());

        List<ProductEntity> productEntities = new ArrayList<ProductEntity>();
        for(ProductTO product : products) {
            if(product.getQuantity() > 0)
                productEntities.add(ProductMapper.mapProduct(product));
        }
        productRepository.save(productEntities);

        if(fridge == null) {
            fridge = new UserFridgeEntity();
            fridge.setUser(userEntity);
        }
        fridge.setProducts(productEntities);
        userFridgeRepository.save(fridge);
        if(userEntity.getUserFridge() == null) {
            userEntity.setUserFridge(fridge);
            userRepository.save(userEntity);
        }
    }
}
