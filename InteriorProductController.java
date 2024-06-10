
package com.example.interiordesign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class InteriorProductController {

    @Autowired
    private InteriorProductService productService;

    @GetMapping("/products")
    public List<InteriorProduct> getAllProducts() {
        return productService.getAllProducts();
    }
}
