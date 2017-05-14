package com.pwr.model;

import javax.persistence.*;
import java.util.Set;

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
