package com.ticket.common.dto;

public enum OrderStatus {
    SUCCESS,
    FAILED;

    public boolean isSuccess() {
        return this == SUCCESS;
    }

    public boolean isFailed() {
        return this == FAILED;
    }
}
