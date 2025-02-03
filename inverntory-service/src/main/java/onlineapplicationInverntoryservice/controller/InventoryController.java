package onlineapplicationInverntoryservice.controller;

import lombok.RequiredArgsConstructor;
import onlineapplicationInverntoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/{sku_code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStoke(@PathVariable("sku_code") String skuCode) {
        return inventoryService.isInStock(skuCode);
    }

}
