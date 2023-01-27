
package com.Maket.Market.domain;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseDTO {

    private int purchaseIdDTO;
    private String customerIdDTO;
    private LocalDateTime dateDTO;
    private String paymentMethodDTO;
    private String commentDTO;
    private String statusDTO;
    private List<PurchaseItemDTO> purchaseItemDTO;

    public int getPurchaseIdDTO() {
        return purchaseIdDTO;
    }

    public void setPurchaseIdDTO(int purchaseIdDTO) {
        this.purchaseIdDTO = purchaseIdDTO;
    }

    public String getCustomerIdDTO() {
        return customerIdDTO;
    }

    public void setCustomerIdDTO(String customerIdDTO) {
        this.customerIdDTO = customerIdDTO;
    }

    public LocalDateTime getDateDTO() {
        return dateDTO;
    }

    public void setDateDTO(LocalDateTime dateDTO) {
        this.dateDTO = dateDTO;
    }

    public String getPaymentMethodDTO() {
        return paymentMethodDTO;
    }

    public void setPaymentMethodDTO(String paymentMethodDTO) {
        this.paymentMethodDTO = paymentMethodDTO;
    }

    public String getCommentDTO() {
        return commentDTO;
    }

    public void setCommentDTO(String commentDTO) {
        this.commentDTO = commentDTO;
    }

    public String getStatusDTO() {
        return statusDTO;
    }

    public void setStatusDTO(String statusDTO) {
        this.statusDTO = statusDTO;
    }

    public List<PurchaseItemDTO> getPurchaseItemDTO() {
        return purchaseItemDTO;
    }

    public void setPurchaseItemDTO(List<PurchaseItemDTO> purchaseItemDTO) {
        this.purchaseItemDTO = purchaseItemDTO;
    }
    
}
