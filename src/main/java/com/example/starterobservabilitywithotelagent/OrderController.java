package com.example.starterobservabilitywithotelagent;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    private final OrderRepository orderRepository;

    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id) {
        var order = this.orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid id: %d".formatted(id)));
        log.info("Success retrieved order: {}", order);
        return order;
    }
}
