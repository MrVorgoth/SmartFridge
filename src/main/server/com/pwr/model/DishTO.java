package com.pwr.model;

import java.util.Set;

public class DishTO {

    private Long idDish;

    private Set<ProductEntity> products;

    private DietEntity dietEntity;

    public Long getIdDish() {
      return idDish;
    }

    public void setIdDish(Long idDish) {
      this.idDish = idDish;
    }

    public Set<ProductEntity> getProducts() {
      return products;
    }

    public void setProducts(Set<ProductEntity> products) {
      this.products = products;
    }

    public DietEntity getDietEntity() {
      return dietEntity;
    }

    public void setDietEntity(DietEntity dietEntity) {
      this.dietEntity = dietEntity;
    }
}
