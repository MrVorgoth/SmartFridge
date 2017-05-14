package com.pwr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Dish {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idDish;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Diet diet;

    public Long getIdDish() {
       return idDish;
    }

    public void setIdDish(Long idDish) {
      this.idDish = idDish;
    }

    public Diet getDiet() {
      return diet;
    }

    public void setDiet(Diet diet) {
      this.diet = diet;
    }

}
