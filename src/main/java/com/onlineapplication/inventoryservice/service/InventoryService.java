package com.onlineapplication.inventoryservice.service;

import com.onlineapplication.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import module.Inventory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;


    public boolean isInStock(String skuCode){
         return inventoryRepository.findBySkuCode().isPresent();


    }
}
