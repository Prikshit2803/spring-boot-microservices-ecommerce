package com.prik.inventoryservice.controller;

import com.prik.inventoryservice.dto.InventoryResponse;
import com.prik.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        //takes skucode and verifies whether product is in stock or not
        return inventoryService.isInStock(skuCode);
    }
}
