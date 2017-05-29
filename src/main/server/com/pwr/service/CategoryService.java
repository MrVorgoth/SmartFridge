package com.pwr.service;

import com.pwr.mappers.CategoryMapper;
import com.pwr.mappers.UserMapper;
import com.pwr.model.CategoryTO;
import com.pwr.model.ProductTO;
import com.pwr.model.UserTO;
import com.pwr.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magda Zielonka on 19.05.2017.
 */
@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryTO> getAll() {
        List<CategoryTO> result = new ArrayList<CategoryTO>();
        categoryRepository.findAll().forEach(cat -> result.add(CategoryMapper.mapCategory(cat)));
        return result;
    }
}
