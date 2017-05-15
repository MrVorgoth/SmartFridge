package com.pwr.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class DietEntity {

    @Id
    @GeneratedValue
    private Long idDiet;

    @Column
    private String typeOfDiet;

    @OneToMany(cascade = { CascadeType.ALL })
    private Set<DishEntity> dishEntitySet;


    public Long getIdDiet() {
      return idDiet;
    }

    public void setIdDiet(Long idDiet) {
      this.idDiet = idDiet;
    }

    public String getTypeOfDiet() {
      return typeOfDiet;
    }

    public void setTypeOfDiet(String typeOfDiet) {
      this.typeOfDiet = typeOfDiet;
    }

    public Set<DishEntity> getDishEntitySet() {
      return dishEntitySet;
    }

    public void setDishEntitySet(Set<DishEntity> dishEntitySet) {
      this.dishEntitySet = dishEntitySet;
    }
}
