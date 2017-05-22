package com.pwr.mappers;

import com.pwr.model.RequiedProductEntity;
import com.pwr.model.RequiedProductTO;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
public class RequiedProductMapper {

    private RequiedProductMapper() {
    }

    public static RequiedProductTO mapRequiedProduct(RequiedProductEntity requiedProductEntity){
        RequiedProductTO product = new RequiedProductTO();
        product.setId(requiedProductEntity.getId());
        product.setQuantity(requiedProductEntity.getQuantity());
        return product;
    }

    public static  RequiedProductEntity mapRequiedProduct(RequiedProductTO productTO){
        RequiedProductEntity product = new RequiedProductEntity();
        product.setId(productTO.getId());
        product.setQuantity(productTO.getQuantity());
        return product;
    }
}
