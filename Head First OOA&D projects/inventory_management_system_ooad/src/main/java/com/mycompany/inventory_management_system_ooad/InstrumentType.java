package com.mycompany.inventory_management_system_ooad;

public enum InstrumentType {
    GUITAR, BANJO, DOBRO, FIDDLE, Mandolin;

    @Override
    public String toString() {
        return switch (this) {
            case GUITAR ->
                "Guitar";
            case Mandolin ->
                "Mandolin";
            case BANJO ->
                "Banjo";
            case DOBRO ->
                "Dobro";
            case FIDDLE ->
                "Fiddle";

            default ->
                "unKnown";

        };
    }

}
