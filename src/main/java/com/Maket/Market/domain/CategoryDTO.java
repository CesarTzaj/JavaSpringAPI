package com.Maket.Market.domain;

public class CategoryDTO {
private Integer categoryIdDTO;
    private String categoryDTO;
    private boolean statusDTO;

    public Integer getCategoryIdDTO() {
        return categoryIdDTO;
    }

    public void setCategoryIdDTO(Integer categoryIdDTO) {
        this.categoryIdDTO = categoryIdDTO;
    }

    public String getCategoryDTO() {
        return categoryDTO;
    }

    public void setCategoryDTO(String categoryDTO) {
        this.categoryDTO = categoryDTO;
    }

    public boolean isStatusDTO() {
        return statusDTO;
    }

    public void setStatusDTO(boolean statusDTO) {
        this.statusDTO = statusDTO;
    }    
}
