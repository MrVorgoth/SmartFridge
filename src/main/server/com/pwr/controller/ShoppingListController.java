package com.pwr.controller;

import com.pwr.repository.ShoppingListRepository;
import com.pwr.service.IShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
@RestController
@RequestMapping(path = "shoppingList")
public class ShoppingListController {

    @Autowired
    private IShoppingListService shoppingListService;
    @Autowired
    private ShoppingListRepository shoppingListRepository;
}
