package com.example.ecomarket.DOM;

import com.example.ecomarket.Models.Category;

public class ProductTypeResponse {
    private Long id;
    private String productTypeName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

}
