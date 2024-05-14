package com.onlineapplication.inventoryservice.service;

import com.onlineapplication.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import module.Inventory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode){
         return inventoryRepository.findBySkuCode().isPresent();


    }
}
