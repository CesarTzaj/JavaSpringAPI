
package com.Maket.Market.domain;

public class ProductDTO {
    private int productIdDTO;
    private String nameDTO;
    private int categoryIdDTO;
    private Double priceDTO;
    private int stockAvailableDTO;
    private Boolean statusDTO;
    private CategoryDTO categoryDTO;

    public int getProductIdDTO() {
        return productIdDTO;
    }

    public void setProductIdDTO(int productIdDTO) {
        this.productIdDTO = productIdDTO;
    }

    public String getNameDTO() {
        return nameDTO;
    }

    public void setNameDTO(String nameDTO) {
        this.nameDTO = nameDTO;
    }

    public int getCategoryIdDTO() {
        return categoryIdDTO;
    }

    public void setCategoryIdDTO(int categoryIdDTO) {
        this.categoryIdDTO = categoryIdDTO;
    }

    public Double getPriceDTO() {
        return priceDTO;
    }

    public void setPriceDTO(Double priceDTO) {
        this.priceDTO = priceDTO;
    }

    public int getStockAvailableDTO() {
        return stockAvailableDTO;
    }

    public void setStockAvailableDTO(int stockAvailableDTO) {
        this.stockAvailableDTO = stockAvailableDTO;
    }

    public Boolean getStatusDTO() {
        return statusDTO;
    }

    public void setStatusDTO(Boolean statusDTO) {
        this.statusDTO = statusDTO;
    }

    public CategoryDTO getCategoryDTO() {
        return categoryDTO;
    }

    public void setCategoryDTO(CategoryDTO categoryDTO) {
        this.categoryDTO = categoryDTO;
    }

    
}
