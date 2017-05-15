package com.pwr.model;


import java.util.Set;

public class DietTO {

    private Long idDiet;

    private String typeOfDiet;

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
