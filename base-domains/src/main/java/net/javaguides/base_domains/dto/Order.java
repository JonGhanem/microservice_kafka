package net.javaguides.base_domains.dto;

public record Order(
    String orderId,
    String name,
    int qty,
    double price
) {
}
