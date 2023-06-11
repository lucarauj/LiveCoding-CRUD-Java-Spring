package br.com.crud.services;

import br.com.crud.dto.ProductDto;
import br.com.crud.models.Product;
import br.com.crud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(ProductDto productDto) {
        Product product = new Product(productDto);
        var newProduct = productRepository.save(product);
        return newProduct;
    }

    public Product updateProduct(ProductDto productDto, String id) {
        var product = productRepository.findById(id).get();
        product.setName(productDto.name());
        product.setPrice_in_cents(productDto.price_in_cents());
        return product;
    }

    public void deleteProduct(String id) {
        var product = productRepository.findById(id).get();
        product.setActive(false);
    }


}
