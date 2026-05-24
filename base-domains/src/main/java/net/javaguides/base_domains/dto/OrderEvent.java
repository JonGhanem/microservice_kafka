package net.javaguides.base_domains.dto;

public record OrderEvent(
    String message,
    String status,
    Order order
) {
}
