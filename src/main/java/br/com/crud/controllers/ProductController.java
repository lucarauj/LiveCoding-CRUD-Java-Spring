package br.com.crud.controllers;

import br.com.crud.domain.product.Product;
import br.com.crud.domain.product.RequestProduct;
import br.com.crud.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity getAllProducts() {
        var allProducts = productRepository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity<Product> registerProduct(@RequestBody @Valid RequestProduct data) {
        Product product = new Product(data);
        return ResponseEntity.ok(productRepository.save(product));
    }
}
