package org.sale.project.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    int quantity;


    @ManyToOne
    Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_variant_id")
    ProductVariant productVariant;


}
