package com.pwr.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Magda on 2017-04-10.
 */
@Entity
public class UserShoppingListEntity {

    @Id
    @GeneratedValue
    private Long id;
    private int quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @OneToOne(cascade = {CascadeType.ALL},mappedBy = "userShoppingList")
    private UserFridgeEntity userFridge;

    public UserFridgeEntity getUserFridge() {
        return userFridge;
    }

    public void setUserFridge(UserFridgeEntity userFridge) {
        this.userFridge = userFridge;
    }

    @ManyToMany
    private Collection<ProductEntity> products;

    public Collection<ProductEntity> getProduts() {
        return products;
    }

    public void setUserFridge(Collection<ProductEntity> products) {
        this.products = products;
    }
}
