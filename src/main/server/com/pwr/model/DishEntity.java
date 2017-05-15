package com.pwr.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;


@Entity
public class DishEntity {

    @Id
    @GeneratedValue
    private Long idDish;

    @OneToMany(cascade = { CascadeType.ALL })
    private Set<ProductEntity> products;

    @ManyToOne(cascade = { CascadeType.ALL })
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
