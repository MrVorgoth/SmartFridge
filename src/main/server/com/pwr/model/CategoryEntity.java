package com.pwr.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
@Entity
public class CategoryEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageURL;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Collection<ProductBaseEntity> productsBase;

    public Collection<ProductBaseEntity> getProduts() {
        return productsBase;
    }

    public void setUserFridge(Collection<ProductBaseEntity> products) {
        this.productsBase = products;
    }
}
