package com.programmingtechie.productservice.service;

import com.programmingtechie.productservice.dto.ProductRequest;
import com.programmingtechie.productservice.dto.ProductResponse;
import com.programmingtechie.productservice.model.Product;
import com.programmingtechie.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


//lombok provides boiler plate code
@Service
@RequiredArgsConstructor //it will automatically create a constructor for us
@Slf4j
public class ProductService {


    private final ProductRepository productRepository;





    public void createProduct(ProductRequest productRequest){

        //we first map the product request
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();//it will create the object type Product with all the above requested details

        productRepository.save(product); //we save the 'product' object to 'ProductRepository'
        log.info("Product {} is saved",product.getId()); //we have used a placeholder '{}' here


    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();

        //now we map 'Product' class to 'ProductResponse' class
        return products.stream().map(this::mapToProductResponse).toList();    //we collect it in a list after mapping

    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
