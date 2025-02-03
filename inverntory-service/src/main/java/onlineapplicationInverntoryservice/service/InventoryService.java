package onlineapplicationInverntoryservice.service;

import lombok.RequiredArgsConstructor;
import onlineapplicationInverntoryservice.model.Inventory;
import onlineapplicationInverntoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode) {
        return inventoryRepository.findBySkuCode().isPresent();

    }
}
