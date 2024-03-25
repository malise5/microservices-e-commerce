package io.github.malise.orderservice.entity;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tbl_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    
    
        @Id
        @Column(name = "order_id")
        @GeneratedValue
        private Integer id;

        @Column(name = "order_number")
        private String orderNumber;

        @Column(name = "order_time")
        private Instant orderTime;

        @OneToMany(cascade = CascadeType.ALL)
        private List<OrderItem> orderItems;
    
        
        
        
        
    
}