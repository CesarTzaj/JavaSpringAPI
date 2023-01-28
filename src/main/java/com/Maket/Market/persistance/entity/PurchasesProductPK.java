package com.Maket.Market.persistance.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PurchasesProductPK implements Serializable{
    @Column(name = "product_id")
    private Integer productId;
    
    @Column(name = "purchase_id")
    private Integer purchaseId;

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
