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

    @OneToOne(cascade = {CascadeType.ALL},mappedBy = "userShoppingList")
    private UserFridgeEntity userFridge = new UserFridgeEntity();

    @ManyToMany
    private Collection<ProductEntity> products;

    public Collection<ProductEntity> getProduts() {
        return products;
    }

    public void setUserFridge(Collection<ProductEntity> products) {
        this.products = products;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
