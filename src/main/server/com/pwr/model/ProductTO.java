package com.pwr.model;

public class ProductTO {

    private Long idProduct;

    private int freeVolume;

    private Boolean isFresh;

    private ProductBaseEntity productBaseEntity;

    private DishEntity dishEntity;

    private FridgeEntity fridgeEntity;

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
