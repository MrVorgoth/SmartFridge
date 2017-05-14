package com.pwr.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class ShoppingList{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idShoppingList;

    @Column
    private Date dayOfShopping;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Product> productSet;

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

    public Set<Product> getProductSet() {
      return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
      this.productSet = productSet;
    }

}
