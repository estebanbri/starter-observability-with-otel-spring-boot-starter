package com.example.starterobservabilitywithotelagent;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Table(name = "orders")
@Getter
@NoArgsConstructor
@ToString
public class Order {
    @Id
    Long id;
    @Column(name = "customer_id")
    Long customerId;
    @Column(name = "order_date")
    ZonedDateTime orderDate;
    @Column(name = "total_amount")
    BigDecimal totalAmount;
}
