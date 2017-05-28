package com.pwr.service;

import com.pwr.mappers.ProductBaseMapper;
import com.pwr.model.ProductBaseEntity;
import com.pwr.model.ProductBaseTO;
import com.pwr.repository.ProductBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lodwr on 06.05.2017.
 */
@Service
public class ProductBaseService implements IProductBaseService {

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
  public void deleteProduct(long id) {
    productBaseRepository.delete(id);
  }

  @Override
  public ProductBaseTO updateProduct(ProductBaseTO product) {
    ProductBaseEntity productBase = ProductBaseMapper.mapProductBase(product);
    productBaseRepository.save(productBase);
    return ProductBaseMapper.mapProductBase(productBase);
  }

  @Override
  public ProductBaseEntity createProduct(ProductBaseTO product) {
    ProductBaseEntity productBase = ProductBaseMapper.mapProductBase(product);
    productBaseRepository.save(productBase);
    return productBase;
  }

  @Override
  public List<ProductBaseTO> findByName(String name) {
    ArrayList<ProductBaseTO> products = new ArrayList<ProductBaseTO>();
    for (ProductBaseEntity pbe : productBaseRepository.findAllByNameStartingWith(name)) {
      products.add(ProductBaseMapper.mapProductBase(pbe));
    }
    return products;
  }

  @Override
  public List<ProductBaseTO> getProducts(String nameFilter, String categoryId) {

    List<ProductBaseTO> products = new ArrayList<ProductBaseTO>();
    List<ProductBaseEntity> productEntities;

//    if(nameFilter != null && categoryId != categoryId)
//      productEntities = productBaseRepository.find(nameFilter, categoryId);
//    else if(categoryId != null)
//      productEntities =  productBaseRepository.findByCat(categoryId);
//
//    productEntities =  productBaseRepository.findByName(nameFilter);
//
//    for(ProductBaseEntity base : productEntities) {
//      products.add(ProductBaseMapper.mapProductBase(base));
//    }

    return products;
  }
}
