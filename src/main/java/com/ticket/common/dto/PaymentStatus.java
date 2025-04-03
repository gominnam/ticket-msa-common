package com.ticket.common.dto;

public enum PaymentStatus {
    SUCCESS,
    FAILED;

    public boolean isSuccess() {
        return this == SUCCESS;
    }

    public boolean isFailed() {
        return this == FAILED;
    }
}
