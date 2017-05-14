package com.pwr.model;

@Entity
public class User {

      @Id
      @GeneratedValue(strategy= GenerationType.AUTO)
      private Long idUser;

      @Column
      private String name;
      @Column
      private String password;

      @ManyToMany(cascade = {CascadeType.ALL})
      private Set<Fridge> fridgeSet;

      public Long getIdUser() {
        return idUser;
      }

      public void setIdUser(Long idUser) {
        this.idUser = idUser;
      }

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public String getPassword() {
        return password;
      }

      public void setPassword(String password) {
        this.password = password;
      }

      public Set<Fridge> getFridgeSet() {
        return fridgeSet;
      }

      public void setFridgeSet(Set<Fridge> fridgeSet) {
        this.fridgeSet = fridgeSet;
      }




}
