package com.pwr.mappers;

import com.pwr.model.ProductBaseEntity;
import com.pwr.model.ProductEntity;
import com.pwr.model.RequiedProductEntity;
import com.pwr.model.RequiedProductTO;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
public class RequiedProductMapper {

    private RequiedProductMapper() {
    }
    

    public static  RequiedProductTO mapRequiedProduct(RequiedProductEntity productEntity) {
        RequiedProductTO productTO = new RequiedProductTO();
        productTO.setId(productEntity.getId());
        productTO.setQuantity(productEntity.getQuantity());

        return productTO;
    }

    public static RequiedProductEntity mapRequiedProduct(RequiedProductTO productTO) {
        RequiedProductEntity productEntity = new RequiedProductEntity();
        productEntity.setId(productTO.getId());
        productEntity.setQuantity(productTO.getQuantity());
        return  productEntity;
    }

}

