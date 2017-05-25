package com.pwr.model;


import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Magda on 2017-04-10.
 */
@Entity
public class UserFridgeEntity {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*@OneToOne(cascade = {CascadeType.ALL},mappedBy = "userFridge")
    private UserEntity user;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }*/

    @OneToOne(cascade = { CascadeType.ALL })
    private UserShoppingListEntity userShoppingList;

    public UserShoppingListEntity getUserShoppingList() {
        return userShoppingList;
    }

    public void setUserShoppingList(UserShoppingListEntity userShoppingList) {
        this.userShoppingList = userShoppingList;
    }

    @ManyToMany
    private Collection<ProductEntity> products;

    public Collection<ProductEntity> getProduts() {
        return products;
    }

    public void setUserFridge(Collection<ProductEntity> products) {
        this.products = products;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userFridge")
    private Collection<RequiedProductEntity> requiedProducts;

    public Collection<RequiedProductEntity> getRequiedProducts() {
        return requiedProducts;
    }

    public void setRequiedProducts(Collection<RequiedProductEntity> products) {
        this.requiedProducts = products;
    }
}
