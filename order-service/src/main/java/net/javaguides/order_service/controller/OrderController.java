package net.javaguides.order_service.controller;

import net.javaguides.base_domains.dto.Order;
import net.javaguides.base_domains.dto.OrderEvent;
import net.javaguides.order_service.kafka.OrderProducer;
import java.util.UUID;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }
    @PostMapping("/order")
    public String placeOrder(@RequestBody Order order){
        Order updatedOrder = new Order(
                UUID.randomUUID().toString(),
                order.name(),
                order.qty(),
                order.price()
        );

        OrderEvent orderEvent = new OrderEvent(
                "Order status is in pending state",
                "PENDING",
                updatedOrder
        );

        orderProducer.sendMessage(orderEvent);

        return "Order placed successfully ...";
    }

}
