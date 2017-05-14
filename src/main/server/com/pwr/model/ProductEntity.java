package com.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

/**
 * Created by Magda on 2017-04-10.
 */
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany(mappedBy = "products")
    private Collection<UserFridgeEntity> userFridge;

    public Collection<UserFridgeEntity> getUserFridge() {
        return userFridge;
    }

    public void setUserFridge(Collection<UserFridgeEntity> userFridge) {
        this.userFridge = userFridge;
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

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
