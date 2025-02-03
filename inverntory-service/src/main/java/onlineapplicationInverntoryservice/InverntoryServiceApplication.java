package onlineapplicationInverntoryservice;

import onlineapplicationInverntoryservice.model.Inventory;
import onlineapplicationInverntoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InverntoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InverntoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("Arun's Content");
            inventory.setQuantity(34);

            inventoryRepository.save(inventory);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("Arun's Content 2");
            inventory1.setQuantity(58);

            inventoryRepository.save(inventory1);
        };
        }
    }


