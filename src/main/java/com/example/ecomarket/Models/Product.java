package com.example.ecomarket.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable = true)
    private String ownerComment;

    @Column(nullable = false)
    private String price;

    @Column(nullable = true)
    private Double rating;

    @ManyToOne
    @JoinColumn(name="product_type_id",nullable = false)
    private ProductType productType;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<ProductDescription> productDescriptions;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<ProductComment> productComments;

    public void addIntoDescriptions(ProductDescription productDescription){
        productDescriptions.add(productDescription);
    }

    public void addIntoComments(ProductComment productComment){
        productComments.add(productComment);
    }

    public void deleteFromDescriptions(ProductDescription productDescription){
        productDescriptions.removeIf(t -> t.getProduct() == productDescription.getProduct());
    }

    public void deleteFromComments(ProductComment productComment){
        productDescriptions.removeIf(t -> t.getProduct() == productComment.getProduct());
    }

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

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public List<ProductDescription> getProductDescriptions() {
        return productDescriptions;
    }

    public void setProductDescriptions(List<ProductDescription> productDescriptions) {
        this.productDescriptions = productDescriptions;
    }

    public List<ProductComment> getProductComments() {
        return productComments;
    }

    public void setProductComments(List<ProductComment> productComments) {
        this.productComments = productComments;
    }
}