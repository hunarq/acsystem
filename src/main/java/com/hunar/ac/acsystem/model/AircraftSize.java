package com.hunar.ac.acsystem.model;
 
import java.util.Arrays;

public enum AircraftSize {
	
		Small(0),Large(1);
		
		private int value;

		private AircraftSize(int value) {
			this.value = value;
		}

		public static AircraftSize fromValue(int value) {
			for (AircraftSize category : values()) {
				if (category.value == (value)) {
					return category;
				}
			}
			
			throw new IllegalArgumentException(
					"Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
		}
		
		 public int getValue() {
		        return value;
		}

	}