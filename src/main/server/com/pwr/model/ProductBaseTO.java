package com.pwr.model;

/**
 * Created by lodwr on 06.05.2017.
 */
public class ProductBaseTO {
  private Long id;

  private String name;

  private String units;

  private int baseValidityPeriod;

  private CategoryTO category;

  public CategoryTO getCategory() {return this.category;}

  public void setCategory(CategoryTO category) {this.category = category;}

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
}
