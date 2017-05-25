package com.pwr.mappers;

import com.pwr.model.UserShoppingListEntity;
import com.pwr.model.UserShoppingListTO;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
public class ShoppingListMapper {

    private ShoppingListMapper() {
    }

    public static UserShoppingListTO mapUser(UserShoppingListEntity userShoppingListEntity) {
        UserShoppingListTO userShoppingList = new UserShoppingListTO();
        userShoppingList.setId(userShoppingListEntity.getId());
        userShoppingList.setQuantity(userShoppingListEntity.getQuantity());
        return userShoppingList;
    }

    public static UserShoppingListEntity mapUser(UserShoppingListTO userShoppingListTO) {
        UserShoppingListEntity userShoppingList = new UserShoppingListEntity();
        userShoppingList.setId(userShoppingListTO.getId());
        userShoppingList.setQuantity(userShoppingListTO.getQuantity());
        return userShoppingList;
    }
}
