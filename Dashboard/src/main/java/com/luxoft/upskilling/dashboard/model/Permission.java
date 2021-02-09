package com.luxoft.upskilling.dashboard.model;

import lombok.Data;


public enum Permission {
    USER_ADD("user:add"),
    USER_READ("user:read");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
