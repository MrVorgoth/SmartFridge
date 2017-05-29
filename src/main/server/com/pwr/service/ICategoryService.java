package com.pwr.service;

import com.pwr.model.CategoryTO;
import com.pwr.model.ProductTO;

import java.util.List;

/**
 * Created by Magda Zielonka on 19.05.2017.
 */
public interface ICategoryService {
    List<CategoryTO> getAll();
}
