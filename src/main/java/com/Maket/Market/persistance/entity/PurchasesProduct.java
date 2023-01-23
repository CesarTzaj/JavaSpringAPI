
package com.Maket.Market.persistance.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shopping_products")
public class PurchasesProduct {
     @EmbeddedId
    private PurchasesProductPK id;
    
    private Integer quantity;
    
    private Double total;
    
    private Boolean status;

        @ManyToOne
    @JoinColumn(name = "purches_id", updatable = false, insertable = false)
    private Purchase purchase;
    
    @ManyToOne
    @JoinColumn(name = "product_id", updatable = false, insertable = false)
    private Product product;
    
    public PurchasesProductPK getId() {
        return id;
    }

    public void setId(PurchasesProductPK id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}