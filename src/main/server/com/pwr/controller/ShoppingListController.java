package com.pwr.controller;

import com.pwr.model.UserShoppingListTO;
import com.pwr.repository.ShoppingListRepository;
import com.pwr.service.IShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ania on 04.06.2017.
 */
@RestController
@RequestMapping(path = "shoppingList")
public class ShoppingListController {

    @Autowired
    private IShoppingListService shoppingListService;
    @Autowired
    private ShoppingListRepository shoppingListRepository;

    @RequestMapping(path = "create", method = RequestMethod.GET)
    @ResponseBody
    public String createShoppingList(@RequestParam("quantity") int quantity){
        shoppingListService.createShoppingList(quantity);

        return "OK";
    }

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<UserShoppingListTO> findAllShoppingList(){
        return shoppingListService.findAllShoppingList();
    }

    @RequestMapping(path = "delete", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteShoppingList(@RequestParam("id") long id) {

        shoppingListService.delateShoppingList(id);
    }

    @RequestMapping(path = "search", method = RequestMethod.GET)
    public List<UserShoppingListTO> findShoppingListByID(@RequestParam("id") long id) {
        return shoppingListService.findShoppingListByID(id);
    }
}
