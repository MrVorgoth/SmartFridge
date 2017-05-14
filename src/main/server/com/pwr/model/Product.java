package com.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idProduct;

    @Column
    private int freeVolume;
    @Column
    private int calories;
    @Column
    private boolean isFresh;
    @Columnt
    private int isAllowedToEat;

    @ManyToOne(cascade = {CascadeType.ALL})
    private ShoppingList shoppingList;
    @ManyToOne(cascade = {CascadeType.ALL})
    private Fridge fridge;
    @ManyToOne(cascade = {CascadeType.ALL})
    private Dish dish;

    public Long getIdProduct() {
      return idProduct;
    }

    public void setIdProduct(Long idProduct) {
      this.idProduct = idProduct;
    }

    public int getFreeVolume() {
      return freeVolume;
    }

    public void setFreeVolume(int freeVolume) {
      this.freeVolume = freeVolume;
    }

    public int getCalories() {
      return calories;
    }

    public void setCalories(int calories) {
      this.calories = calories;
    }

    public boolean isFresh() {
      return isFresh;
    }

    public void setFresh(boolean fresh) {
      isFresh = fresh;
    }

    public int getIsAllowedToEat() {
      return isAllowedToEat;
    }

    public void setIsAllowedToEat(int isAllowedToEat) {
      this.isAllowedToEat = isAllowedToEat;
    }

    public ShoppingList getShoppingList() {
      return shoppingList;
    }

    public void setShoppingList(ShoppingList shoppingList) {
      this.shoppingList = shoppingList;
    }

    public Fridge getFridge() {
      return fridge;
    }

    public void setFridge(Fridge fridge) {
      this.fridge = fridge;
    }

    public Dish getDish() {
      return dish;
    }

    public void setDish(Dish dish) {
      this.dish = dish;
    }

}
