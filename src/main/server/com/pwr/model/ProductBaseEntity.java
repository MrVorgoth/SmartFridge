package com.pwr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lodwr on 06.05.2017.
 */
@Entity
public class ProductBaseEntity {

  @Id
  @GeneratedValue
  private Long id;
  @Column
  private String name;

  @Column
  private String units;

  @Column
  private int baseValidityPeriod;

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
