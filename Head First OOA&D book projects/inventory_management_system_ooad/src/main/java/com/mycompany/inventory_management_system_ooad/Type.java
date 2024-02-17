package com.mycompany.inventory_management_system_ooad;

public enum Type {
	ACOUSTIC, ELECTRIC;

        @Override
	public String toString() {
            return switch (this) {
                case ACOUSTIC -> "Acoustic";
                case ELECTRIC -> "Electric";
                default -> "Unknown";
            };

	}
}
