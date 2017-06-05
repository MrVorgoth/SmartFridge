package com.pwr.service;

import com.pwr.model.RequiedProductTO;

import java.util.List;

/**
 * Created by Ania on 04.06.2017.
 */
public interface IRequiedProductService {

    List<RequiedProductTO> findAllRequiedProd();
    void createRequiedProd(int quantity);
}
