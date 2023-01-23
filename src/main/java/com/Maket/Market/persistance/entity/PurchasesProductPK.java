package com.Maket.Market.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PurchasesProductPK {
    @Column(name = "category_id ")
    private Integer purchaseID;
    
    @Column(name = "product_id")
    private Integer productID;
    
    public Integer getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(Integer purchaseID) {
        this.purchaseID = purchaseID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }
}
