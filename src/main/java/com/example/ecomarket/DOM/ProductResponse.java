package com.example.ecomarket.DOM;

import com.example.ecomarket.Models.ProductComment;
import com.example.ecomarket.Models.ProductDescription;
import com.example.ecomarket.Models.ProductType;

import java.util.ArrayList;
import java.util.List;

public class ProductResponse {

    private Long id;
    private String name;
    private String ownerComment;
    private String price;
    private Double rating;
    private ProductTypeResponse productTypeResponse;
    private ArrayList<ProductDescriptionRequest> productDescriptionRequestArrayList;
    private ArrayList<ProductCommentRequest> productCommentRequestArrayList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerComment() {
        return ownerComment;
    }

    public void setOwnerComment(String ownerComment) {
        this.ownerComment = ownerComment;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public ProductTypeResponse getProductTypeResponse() {
        return productTypeResponse;
    }

    public void setProductTypeResponse(ProductTypeResponse productTypeResponse) {
        this.productTypeResponse = productTypeResponse;
    }

    public ArrayList<ProductDescriptionRequest> getProductDescriptionRequestArrayList() {
        return productDescriptionRequestArrayList;
    }

    public void setProductDescriptionRequestArrayList(ArrayList<ProductDescriptionRequest> productDescriptionRequestArrayList) {
        this.productDescriptionRequestArrayList = productDescriptionRequestArrayList;
    }

    public ArrayList<ProductCommentRequest> getProductCommentRequestArrayList() {
        return productCommentRequestArrayList;
    }

    public void setProductCommentRequestArrayList(ArrayList<ProductCommentRequest> productCommentRequestArrayList) {
        this.productCommentRequestArrayList = productCommentRequestArrayList;
    }
}
