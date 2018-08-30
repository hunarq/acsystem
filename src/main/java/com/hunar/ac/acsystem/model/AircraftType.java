package com.hunar.ac.acsystem.model;

import java.util.Arrays;

public enum AircraftType {
		
		Emergency("Emergency"),VIP("vip"),Passenger("passenger"),Cargo("cargo");
		
		private String value;

		private AircraftType(String value) {
			this.value = value;
		}

		public static AircraftType fromValue(String value) {
			for (AircraftType category : values()) {
				if (category.value.equalsIgnoreCase(value)) {
					return category;
				}
			}
			throw new IllegalArgumentException(
					"Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
		}

	}