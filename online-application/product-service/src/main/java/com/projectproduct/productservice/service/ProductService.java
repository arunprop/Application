package com.projectproduct.productservice.service;

import com.projectproduct.productservice.dto.ProductRequest;
import com.projectproduct.productservice.dto.ProductResponse;
import com.projectproduct.productservice.model.Product;
import com.projectproduct.productservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ProductService {

    //rgwnjn

    private final ProductRepository productRepository;
    public void createProduct(ProductRequest productRequest){
        Product product= Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        log.info("Product {} is Saved" ,product.getId())     ;
    }
    //gygvgv

    public List<ProductResponse> getAllProducts() {
       List<Product> products= productRepository.findAll();
       return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return  ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();

    }
}
