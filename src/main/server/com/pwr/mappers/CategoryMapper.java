package com.pwr.mappers;

import com.pwr.model.CategoryEntity;
import com.pwr.model.CategoryTO;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
public class CategoryMapper {

    private CategoryMapper(){
    }

    public static CategoryTO mapCategory(CategoryEntity categoryEntity) {
        CategoryTO category = new CategoryTO();
        category.setId(categoryEntity.getId());
        category.setName(categoryEntity.getName());
        category.setImageURL(categoryEntity.getImageURL());
        return category;
    }

    public static CategoryEntity mapCategory(CategoryTO categoryTO) {
        CategoryEntity category = new CategoryEntity();
        category.setId(categoryTO.getId());
        category.setName(categoryTO.getName());
        category.setImageURL(categoryTO.getImageURL());
        return category;
    }
}
