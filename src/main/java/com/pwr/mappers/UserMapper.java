package com.pwr.mappers;

import com.pwr.model.UserEntity;
import com.pwr.model.UserTO;


public class UserMapper {

    private UserMapper() {

    }

    public static UserTO mapUser(UserEntity userEntity) {
        UserTO user = new UserTO();
        user.setName(userEntity.getName());
        user.setSurname(userEntity.getSurname());
        return user;
    }
}
