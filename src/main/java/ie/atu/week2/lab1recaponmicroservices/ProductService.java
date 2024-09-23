package ie.atu.week2.lab1recaponmicroservices;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productList;
    }

    @PostMapping("/products")
    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }
}
