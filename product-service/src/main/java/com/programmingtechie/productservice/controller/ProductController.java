package com.programmingtechie.productservice.controller;

import com.programmingtechie.productservice.dto.ProductRequest;
import com.programmingtechie.productservice.dto.ProductResponse;
import com.programmingtechie.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {



    private final ProductService productService; //constructor used from @RequiredArgsConstructor
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    //api to create the products
    public void createProduct(@RequestBody ProductRequest productRequest) { //we are going to recieve product information

        productService.createProduct(productRequest); //use createProduct function from 'ProductService'
        //this way an end-point to create product is created
    }

    //now we try to get end-points of all products
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
