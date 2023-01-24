
package com.Maket.Market.persistance.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "purchases")
public class Purchase {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "	purches_id")
    private Integer purchaseID;
    
    @Column(name = "customer_id	")
    private Integer customerId;
    
    private String date;
    
    @Column(name = "payment_method")
    private String paymentMethod;
    
    private String comments;
    
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "customer_id", insertable = false, updatable = false)
    private Customer customer;
    
    @OneToMany(mappedBy = "product")
    private List<PurchasesProduct> purchasesProduct;

    public Integer getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(Integer purchaseID) {
        this.purchaseID = purchaseID;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<PurchasesProduct> getPurchasesProduct() {
        return purchasesProduct;
    }

    public void setPurchasesProduct(List<PurchasesProduct> purchasesProduct) {
        this.purchasesProduct = purchasesProduct;
    }
    
     
}
