package com.pwr.service;

import com.pwr.model.RequiedProductTO;

import java.util.List;

/**
 * Created by Magda Zielonka on 19.05.2017.
 */
public interface IRequiedProductService {
    List<RequiedProductTO> findAllRequiedProducts();

}
