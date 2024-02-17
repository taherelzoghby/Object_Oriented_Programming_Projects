package com.mycompany.inventory_management_system_ooad;

public enum Style {
    A, F;

    @Override
    public String toString() {
        return switch (this) {
            case A ->
                "A";
            case F ->
                "F";
            default ->
                "unknown";

        };
    }
}
