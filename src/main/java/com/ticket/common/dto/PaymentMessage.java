package com.ticket.common.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMessage {
    private Long orderId;
    private Integer amount;
    private Long userId;
    @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private PaymentStatus status;
    @Setter
    private String message;
}
