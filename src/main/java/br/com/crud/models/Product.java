package br.com.crud.models;

import br.com.crud.dto.ProductDto;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "Product")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Integer price_in_cents;

    private Boolean active;

    public Product(ProductDto product) {
        this.name = product.name();
        this.price_in_cents = product.price_in_cents();
        this.active = true;
    }
}
