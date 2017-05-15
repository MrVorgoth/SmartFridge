package com.pwr.model;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FridgeEntity {

    @Id
    @GeneratedValue
    private Long idFridge;

    @OneToMany(cascade = { CascadeType.ALL })
    private Set<ProductEntity> productEntitySet;

    @ManyToMany(cascade = { CascadeType.ALL })
    private Set<UserEntity> userEntities;

    public Long getIdFridge() {
      return idFridge;
    }

    public void setIdFridge(Long idFridge) {
      this.idFridge = idFridge;
    }

    public Set<ProductEntity> getProductEntitySet() {
      return productEntitySet;
    }

    public void setProductEntitySet(Set<ProductEntity> productEntitySet) {
      this.productEntitySet = productEntitySet;
    }

    public Set<UserEntity> getUserEntities() {
      return userEntities;
    }

    public void setUserEntities(Set<UserEntity> userEntities) {
      this.userEntities = userEntities;
    }
}
