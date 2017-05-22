package com.pwr.mappers;

import com.pwr.model.UserFridgeEntity;
import com.pwr.model.UserFridgeTO;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
public class UserFridgeMapper {

    private UserFridgeMapper() {
    }

    public static UserFridgeTO mapUser(UserFridgeEntity userFridgeEntity) {
        UserFridgeTO userFridge = new UserFridgeTO();
        userFridge.setId(userFridgeEntity.getId());
        return userFridge;
    }

    public static UserFridgeEntity mapUser(UserFridgeTO userFridgeTO) {
        UserFridgeEntity userFridge = new UserFridgeEntity();
        userFridge.setId(userFridgeTO.getId());
        return userFridge;
    }
}
