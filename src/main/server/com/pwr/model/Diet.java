package com.pwr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Diet {

      @Id
      @GeneratedValue(strategy= GenerationType.AUTO)
      private Long idDiet;
      @Column
      private String typeOfDiet;

      @OneToMany(cascade = {CascadeType.ALL})
      private Set<Dish> dishSet;


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

      public Set<Dish> getDishSet() {
        return dishSet;
      }

      public void setDishSet(Set<Dish> dishSet) {
        this.dishSet = dishSet;
      }

}
