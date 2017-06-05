package com.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
@Entity
public class RequiedProductEntity {
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

    @ManyToOne
    private UserFridgeEntity userFridge;

    public UserFridgeEntity getUserFridge() {
        return userFridge;
    }

    public void setUserFridge(UserFridgeEntity userFridge) {
        this.userFridge = userFridge;
    }

    @ManyToOne
    private ProductBaseEntity productBase;

    public ProductBaseEntity getProductBase() {
        return productBase;
    }

    public void setProductBase(ProductBaseEntity productBase) {
        this.productBase = productBase;
    }

}
