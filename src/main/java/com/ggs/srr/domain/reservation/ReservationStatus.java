package com.ggs.srr.domain.reservation;

public enum ReservationStatus {

    BEFORE_USE("사용전"),
    IN_USE("사용중"),
    END_OF_US("사용후");

    private final String text;

    ReservationStatus(String text) {
        this.text = text;
    }
}
