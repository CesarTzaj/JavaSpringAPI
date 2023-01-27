package com.Maket.Market.domain;

import java.time.LocalDateTime;

public class PurchaseItemDTO {
    
    private int productIdDTO;
    private int quantityDTO;
    private double totalDTO;
    private boolean activeDTO;

    public int getProductIdDTO() {
        return productIdDTO;
    }

    public void setProductIdDTO(int productIdDTO) {
        this.productIdDTO = productIdDTO;
    }

    public int getQuantityDTO() {
        return quantityDTO;
    }

    public void setQuantityDTO(int quantityDTO) {
        this.quantityDTO = quantityDTO;
    }

    public double getTotalDTO() {
        return totalDTO;
    }

    public void setTotalDTO(double totalDTO) {
        this.totalDTO = totalDTO;
    }

    public boolean isActiveDTO() {
        return activeDTO;
    }

    public void setActiveDTO(boolean activeDTO) {
        this.activeDTO = activeDTO;
    }

}
