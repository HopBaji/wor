package com.example.solarv2.enums;

public enum ConditionEnum  {
    USED("Б/У"),
    NEW("Новый");

    private final String displayName;

    ConditionEnum(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
    }

