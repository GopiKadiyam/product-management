package com.gk.productmanagement.controller;

import com.gk.productmanagement.entity.Product;
import com.gk.productmanagement.model.CreateProductRequestDTO;
import com.gk.productmanagement.model.CreateProductResponseDTO;
import com.gk.productmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @PostMapping
    public CreateProductResponseDTO createProduct(@RequestBody CreateProductRequestDTO createProductRequestDTO){
        Product product=new Product();
        product.setCategory(createProductRequestDTO.getCategory());
        product.setName(createProductRequestDTO.getName());
        product.setPrice(createProductRequestDTO.getPrice());
        product.setOfferApplicable(createProductRequestDTO.isOfferApplicable());
        product.setOfferPercentage(createProductRequestDTO.getOfferPercentage());
        product.setFeatures(createProductRequestDTO.getFeatures());

        Product savedProduct=productRepository.save(product);

        CreateProductResponseDTO createProductResponseDTO=new CreateProductResponseDTO();
        createProductResponseDTO.setProductId(savedProduct.getId());
        createProductResponseDTO.setName(savedProduct.getName());

        return createProductResponseDTO;
    }

}
