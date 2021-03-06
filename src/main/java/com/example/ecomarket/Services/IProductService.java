package com.example.ecomarket.Services;

import com.example.ecomarket.DOM.ProductCommentRequest;
import com.example.ecomarket.DOM.ProductDescriptionRequest;
import com.example.ecomarket.Facade.DTO.ProductDTO;
import com.example.ecomarket.Models.ProductComment;

import java.util.ArrayList;

public interface IProductService {
    ProductDTO create(ProductDTO dto);

    ArrayList<ProductDescriptionRequest> getProductDescriptions(Long id);

    ArrayList<ProductCommentRequest> getProductComments(Long id);

    ArrayList<ProductDTO> getAll();

    ArrayList<ProductDTO> getAllByProductTypeId(Long id);

    ArrayList<ProductDTO> getAllByCustomerId(Long id);

    ProductDTO getById(Long id);

    ProductCommentRequest comment(ProductComment productComment, Long id);
}
