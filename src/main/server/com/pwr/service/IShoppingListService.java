package com.pwr.service;

import com.pwr.model.UserShoppingListTO;

import java.util.List;

/**
 * Created by Ania on 04.06.2017.
 */
public interface IShoppingListService {

    List<UserShoppingListTO> findAllShoppingList();
    List<UserShoppingListTO> findShoppingListByID(long id);
    void createShoppingList(int quantity);
    void delateShoppingList(long id);
}
