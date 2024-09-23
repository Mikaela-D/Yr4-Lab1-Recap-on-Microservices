package ie.atu.week2.lab1recaponmicroservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {

    private List<Product> productlist = new ArrayList<Product>();
    @Autowired
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productlist;
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        productlist.add(product);
        return product;
    }
}
