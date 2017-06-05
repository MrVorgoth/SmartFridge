package com.pwr.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by lodwr on 06.05.2017.
 */
@Entity
public class ProductBaseEntity {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String units;
  private int baseValidityPeriod;
  private String description;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @ManyToOne
  private CategoryEntity category;

  public CategoryEntity getCategory() {
    return category;
  }

  public void setCategory(CategoryEntity category) {
    this.category = category;
  }

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "productBase")
  private Collection<ProductEntity> products;

  public Collection<ProductEntity> getProduts() {
    return products;
  }

  public void setUserFridge(Collection<ProductEntity> products) {
    this.products = products;
  }

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "productBase")
  private Collection<RequiedProductEntity> requiedProducts;

  public Collection<RequiedProductEntity> getRequiedProducts() {
    return requiedProducts;
  }

  public void setRequiedProducts(Collection<RequiedProductEntity> products) {
    this.requiedProducts = products;
  }


}
