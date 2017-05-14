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
public class DishEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private Collection<ProductEntity> products;

    public Collection<ProductEntity> getProduts() {
        return products;
    }

    public void setUserFridge(Collection<ProductEntity> products) {
        this.products = products;
    }
}
