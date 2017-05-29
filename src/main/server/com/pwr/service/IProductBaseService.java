package com.pwr.service;

import com.pwr.model.CategoryTO;
import com.pwr.model.ProductBaseEntity;
import com.pwr.model.ProductBaseTO;

import java.util.List;

/**
 * Created by lodwr on 06.05.2017.
 */
public interface IProductBaseService {

  List<ProductBaseTO> findAllProducts();
  void createProduct(String name, String unit, int validityPeriod);
  void deleteProduct(long id);
  ProductBaseTO updateProduct(ProductBaseTO product);
  ProductBaseEntity createProduct(ProductBaseTO product);
  List<ProductBaseTO> findByName(String name);

  ///
  List<ProductBaseTO> getProducts(String nameFilter, long categoryId);


}
