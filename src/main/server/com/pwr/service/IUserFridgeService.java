package com.pwr.service;

import com.pwr.model.ProductTO;

import java.util.List;

/**
 * Created by Magda Zielonka on 19.05.2017.
 */
public interface IUserFridgeService {
    List<ProductTO> getFridgeContent(String login);

    void setFridgeContent(List<ProductTO> products, String login);

}
