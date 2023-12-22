package com.prik.inventoryservice.repository;

import com.prik.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    //spring data jpa will automatically implement the method findBySkuCode


    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
