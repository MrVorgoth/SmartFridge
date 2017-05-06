package com.pwr.service;

import com.pwr.mappers.ProductBaseMapper;
import com.pwr.model.ProductBaseEntity;
import com.pwr.model.ProductBaseTO;
import com.pwr.model.ProductEntity;
import com.pwr.repository.PatientRepository;
import com.pwr.repository.ProductBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lodwr on 06.05.2017.
 */
@Service
public class ProductBaseService implements IProductBase{

  @Autowired
  private ProductBaseRepository productBaseRepository;

  @Override
  public List<ProductBaseTO> findAllProducts() {
    List<ProductBaseTO> result = new ArrayList<ProductBaseTO>();
    productBaseRepository.findAll().forEach(productBaseEntity -> result.add(ProductBaseMapper.mapProductBase(productBaseEntity)));

    return result;
  }

  @Override
  public void createProduct(String name, String unit, int validityPeriod) {
    ProductBaseEntity productBase = new ProductBaseEntity();
    productBase.setName(name);
    productBase.setUnits(unit);
    productBase.setBaseValidityPeriod(validityPeriod);

    productBaseRepository.save(productBase);
  }

  @Override
  public void createProduct(ProductBaseTO product) {
    productBaseRepository.save(ProductBaseMapper.mapProductBase(product));
  }

  @Override
  public List<ProductBaseEntity> findByName(String name) {
    return productBaseRepository.findByName(name);
  }
}
