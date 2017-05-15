package com.pwr.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Magda on 2017-04-10.
 */
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue
    private Long idProduct;

    @Column
    private int freeVolume;

    @Column
    private Boolean isFresh;

    @ManyToOne(cascade = { CascadeType.ALL })
    private ProductBaseEntity productBaseEntity;

    @ManyToOne(cascade = { CascadeType.ALL })
    private DishEntity dishEntity;

    @ManyToOne(cascade = { CascadeType.ALL })
    private FridgeEntity fridgeEntity;

    @ManyToOne(cascade = { CascadeType.ALL })
    private ShoppingListEntity shoppingListEntity;

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

    public Boolean getFresh() {
      return isFresh;
    }

    public void setFresh(Boolean fresh) {
      isFresh = fresh;
    }

    public ProductBaseEntity getProductBaseEntity() {
      return productBaseEntity;
    }

    public void setProductBaseEntity(ProductBaseEntity productBaseEntity) {
      this.productBaseEntity = productBaseEntity;
    }

    public DishEntity getDishEntity() {
      return dishEntity;
    }

    public void setDishEntity(DishEntity dishEntity) {
      this.dishEntity = dishEntity;
    }

    public FridgeEntity getFridgeEntity() {
      return fridgeEntity;
    }

    public void setFridgeEntity(FridgeEntity fridgeEntity) {
      this.fridgeEntity = fridgeEntity;
    }

    public ShoppingListEntity getShoppingListEntity() {
      return shoppingListEntity;
    }

    public void setShoppingListEntity(ShoppingListEntity shoppingListEntity) {
      this.shoppingListEntity = shoppingListEntity;
    }
}
