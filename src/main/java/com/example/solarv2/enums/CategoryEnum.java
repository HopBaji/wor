package com.example.solarv2.enums;

public enum CategoryEnum {
    ELECTRONICS("Электроника"),
    CLOTHES("Одежда"),
    REALTY("Недвижимость"),
    ANIMALS("Животные"),
    TRANSPORT("Транспорт"),
    OTHER("Другое");

    private final String displayName;

    CategoryEnum(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
