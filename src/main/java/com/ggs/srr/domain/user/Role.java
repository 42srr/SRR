package com.ggs.srr.domain.user;

public enum Role {

    CADET("cadet"),
    ADMIN("admin"),
    BOCAL("bocal"),
    ;

    private final String text;

    Role(String text) {
        this.text = text;
    }

}
