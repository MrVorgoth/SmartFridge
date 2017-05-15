package com.pwr.model;


import java.util.Set;

public class FridgeTO {

  private Long idFridge;

  private Set<ProductEntity> productEntitySet;

  private Set<UserEntity> userEntities;

  public Long getIdFridge() {
    return idFridge;
  }

  public void setIdFridge(Long idFridge) {
    this.idFridge = idFridge;
  }

  public Set<ProductEntity> getProductEntitySet() {
    return productEntitySet;
  }

  public void setProductEntitySet(Set<ProductEntity> productEntitySet) {
    this.productEntitySet = productEntitySet;
  }

  public Set<UserEntity> getUserEntities() {
    return userEntities;
  }

  public void setUserEntities(Set<UserEntity> userEntities) {
    this.userEntities = userEntities;
  }
}
