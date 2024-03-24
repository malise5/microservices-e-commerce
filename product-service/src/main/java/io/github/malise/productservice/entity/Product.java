package io.github.malise.productservice.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_product")
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue
    private Integer id;

    
    @Column(name = "product_name")
    private String name;

    @Column(name = "product_price")
    private BigDecimal price;
    
}
