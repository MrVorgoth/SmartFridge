package com.pwr.service;

import com.pwr.mappers.ShoppingListMapper;
import com.pwr.model.UserShoppingListEntity;
import com.pwr.model.UserShoppingListTO;
import com.pwr.repository.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ania on 04.06.2017.
 */
@Service
public class ShoppingListService implements IShoppingListService {

    @Autowired
    private ShoppingListRepository shoppingListRepository;

    @Override
    public List<UserShoppingListTO> findAllShoppingList() {
        List<UserShoppingListTO> result = new ArrayList<UserShoppingListTO>();
        shoppingListRepository.findAll().forEach(shoppingList -> result.add(ShoppingListMapper.mapUser(shoppingList)));
        return result;
    }

    @Override
    public List<UserShoppingListTO> findShoppingListByID(long id) {
        List<UserShoppingListTO> result = new ArrayList<UserShoppingListTO>();
        for (UserShoppingListEntity userShoppingListEntity : shoppingListRepository.findAllById(id)) {
            result.add(ShoppingListMapper.mapUser(userShoppingListEntity));
        }
        return result;
    }

    @Override
    public void createShoppingList(int quantity) {
        UserShoppingListEntity userShoppingListEntity = new UserShoppingListEntity();
        userShoppingListEntity.setQuantity(quantity);

        shoppingListRepository.save(userShoppingListEntity);

    }

    @Override
    public void delateShoppingList(long id) {
        shoppingListRepository.delete(id);
    }
}
