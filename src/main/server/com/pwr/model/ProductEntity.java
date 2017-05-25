package com.pwr.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Magda on 2017-04-10.
 */
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue
    private Long id;
    private Date insertDate;
    private boolean fresh;
    private int quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public boolean getFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @ManyToMany(mappedBy = "products")
    private Collection<DishEntity> dish;

    public Collection<DishEntity> getDish() {
        return dish;
    }

    public void setDish(Collection<DishEntity> dish) {
        this.dish = dish;
    }

    @ManyToMany(mappedBy = "products")
    private Collection<UserShoppingListEntity> userShoppingList;

    public Collection<UserShoppingListEntity> getUserShoppingList() {
        return userShoppingList;
    }

    public void setUserShoppingList(Collection<UserShoppingListEntity> userShoppingList) {
        this.userShoppingList = userShoppingList;
    }

    @ManyToMany(mappedBy = "products")
    private Collection<UserFridgeEntity> userFridge;

    public Collection<UserFridgeEntity> getUserFridge() {
        return userFridge;
    }

    public void setUserFridge(Collection<UserFridgeEntity> userFridge) {
        this.userFridge = userFridge;
    }

    @ManyToOne
    private ProductBaseEntity productBase;

    public ProductBaseEntity getProductBaseEntity() {
        return productBase;
    }

    public void setProductBaseEntity(ProductBaseEntity productBaseEntity) {
        this.productBase = productBaseEntity;
    }
}
