package com.Maket.Market.persistance.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PurchasesProductPK implements Serializable{
    @Column(name = "category_id ")
    private Integer purchaseId;
    
    @Column(name = "product_id")
    private Integer productId;

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }


    
   
}
