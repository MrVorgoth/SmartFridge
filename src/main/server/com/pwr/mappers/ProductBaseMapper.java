package com.pwr.mappers;

import com.pwr.model.ProductBaseEntity;
import com.pwr.model.ProductBaseTO;

/**
 * Created by lodwr on 06.05.2017.
 */
public class ProductBaseMapper {

  private ProductBaseMapper() {

  }

  public static ProductBaseTO mapProductBase(ProductBaseEntity productBaseEntity) {
    ProductBaseTO productBase = new ProductBaseTO();
    productBase.setName(productBaseEntity.getName());
    productBase.setBaseValidityPeriod(productBaseEntity.getBaseValidityPeriod());
    productBase.setUnits(productBaseEntity.getUnits());
    productBase.setId(productBaseEntity.getId());
    productBase.setCategory(CategoryMapper.mapCategory(productBaseEntity.getCategory()));

    return productBase;
  }

  public static ProductBaseEntity mapProductBase(ProductBaseTO productBaseTO) {
    ProductBaseEntity productBase = new ProductBaseEntity();
    productBase.setName(productBaseTO.getName());
    productBase.setUnits(productBaseTO.getUnits());
    productBase.setBaseValidityPeriod(productBaseTO.getBaseValidityPeriod());
    productBase.setId(productBaseTO.getId());
    productBase.setCategory(CategoryMapper.mapCategory(productBaseTO.getCategory()));

    return productBase;
  }
}
