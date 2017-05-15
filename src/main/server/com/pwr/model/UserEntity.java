package com.pwr.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue
    private Long idUser;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String login;

    @Column
    private String password;


    @ManyToMany(cascade = { CascadeType.ALL })
    private Set<FridgeEntity> fridgeEntitySet;

    public Long getIdUser() { return idUser; }
    public void setIdUser(Long idUser) { this.idUser = idUser; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Set<FridgeEntity> getFridgeEntitySet() {
      return fridgeEntitySet;
    }

    public void setFridgeEntitySet(Set<FridgeEntity> fridgeEntitySet) {
      this.fridgeEntitySet = fridgeEntitySet;
    }
}
