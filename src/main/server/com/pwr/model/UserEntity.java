package com.pwr.model;

import javax.persistence.*;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String login;
    private String password;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @OneToOne(cascade = { CascadeType.ALL })
    private UserFridgeEntity userFridge;

    public UserFridgeEntity getUserFridge() {
        return userFridge;
    }

    public void setUserFridge(UserFridgeEntity userFridge) {
        this.userFridge = userFridge;
    }
}
