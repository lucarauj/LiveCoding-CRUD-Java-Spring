package br.com.crud.domain.product;

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

    public Product(RequestProduct product) {
        this.name = product.name();
        this.price_in_cents = product.price_in_cents();
    }
}
