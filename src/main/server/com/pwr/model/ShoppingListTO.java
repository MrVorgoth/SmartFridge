package com.pwr.model;


import java.util.Date;
import java.util.Set;

public class ShoppingListTO {

  private Long idShoppingList;

  private Date dayOfShopping;

  private Set<ProductEntity> productEntitySet;

  public Long getIdShoppingList() {
    return idShoppingList;
  }

  public void setIdShoppingList(Long idShoppingList) {
    this.idShoppingList = idShoppingList;
  }

  public Date getDayOfShopping() {
    return dayOfShopping;
  }

  public void setDayOfShopping(Date dayOfShopping) {
    this.dayOfShopping = dayOfShopping;
  }

  public Set<ProductEntity> getProductEntitySet() {
    return productEntitySet;
  }

  public void setProductEntitySet(Set<ProductEntity> productEntitySet) {
    this.productEntitySet = productEntitySet;
  }
}
