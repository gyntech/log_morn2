package com.hay.model;

public enum Role {
    USER("User"),
    ADMIN("Admin"),
    STAFF("Staff"),
	FELLOW("Fellow");
	
    private final String value;

    private Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
