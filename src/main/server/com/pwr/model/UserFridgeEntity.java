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

    @OneToOne(cascade = {CascadeType.ALL},mappedBy = "userFridge")
    private UserEntity user = new UserEntity();

    @OneToOne(cascade = { CascadeType.ALL })
    private UserShoppingListEntity userShoppingList;

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
