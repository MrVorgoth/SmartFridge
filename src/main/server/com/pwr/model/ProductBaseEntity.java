package com.pwr.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by lodwr on 06.05.2017.
 */
@Entity
public class ProductBaseEntity {

  @Id
  @GeneratedValue
  private Long idProductBase;

  @Column
  private String nameProduct;

  @Column
  private String units;

  @Column
  private int calories;

  @Column
  private int baseValidityPeriod;

  @OneToMany(cascade = { CascadeType.ALL })
  private Set<ProductEntity> productEntitySet;


  public Long getIdProductBase() {
    return idProductBase;
  }

  public void setIdProductBase(Long idProductBase) {
    this.idProductBase = idProductBase;
  }

  public String getNameProduct() {
    return nameProduct;
  }

  public void setNameProduct(String nameProduct) {
    this.nameProduct = nameProduct;
  }

  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }

  public int getBaseValidityPeriod() {
    return baseValidityPeriod;
  }

  public void setBaseValidityPeriod(int baseValidityPeriod) {
    this.baseValidityPeriod = baseValidityPeriod;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public Set<ProductEntity> getProductEntitySet() {
    return productEntitySet;
  }

  public void setProductEntitySet(Set<ProductEntity> productEntitySet) {
    this.productEntitySet = productEntitySet;
  }
}
