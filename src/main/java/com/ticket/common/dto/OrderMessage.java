package com.ticket.common.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderMessage {
    private Long orderId;
    private Integer amount;
    private Long userId;
    @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private OrderStatus status;
    @Setter
    private String message;
}
