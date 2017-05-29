package com.pwr.model;

import java.util.Date;

/**
 * Created by Magda Zielonka on 18.05.2017.
 */
public class ProductTO {

    private Long id;

    private Date insertDate;

    private boolean fresh;

    private int quantity;

    private ProductBaseTO productBase;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public boolean getFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductBaseTO getProductBase() {return this.productBase;}

    public void setProductBase(ProductBaseTO productBase) {this.productBase = productBase;}
}
