package com.pwr.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Fridge {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idFridge;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Product> productSet;

    @ManyToMany(cascade = {CascadeType.ALL})
    private Set<User> userSet;

    public Long getIdFridge() {
      return idFridge;
    }

    public void setIdFridge(Long idFridge) {
      this.idFridge = idFridge;
    }

    public Set<Product> getProductSet() {
      return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
      this.productSet = productSet;
    }

    public Set<User> getUserSet() {
      return userSet;
    }

    public void setUserSet(Set<User> userSet) {
      this.userSet = userSet;
    }

}
