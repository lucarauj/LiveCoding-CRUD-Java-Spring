package br.com.crud.controllers;

import br.com.crud.model.Product;
import br.com.crud.dto.ProductDto;
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
    public ResponseEntity registerProduct(@RequestBody @Valid ProductDto data) {
        Product product = new Product(data);
        return ResponseEntity.ok(productRepository.save(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity updateProduct(@RequestBody @Valid ProductDto data, @PathVariable String id) {
        Product product = productRepository.getReferenceById(id);
        product.setName(data.name());
        product.setPrice_in_cents(data.price_in_cents());
        return ResponseEntity.ok(productRepository.save(product));
    }
}
