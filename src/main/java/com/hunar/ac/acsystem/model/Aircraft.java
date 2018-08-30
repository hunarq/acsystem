package com.hunar.ac.acsystem.model;

public class Aircraft {
	
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private AircraftSize size;
	private AircraftType type;
	
	public Aircraft() {
		
	}
	
	public Aircraft(int id, AircraftSize size, AircraftType type) {
		this.id = id;
		this.size = size;
		this.type = type;
	}

	
	public AircraftType getType() {
		return type;
	}

	public void setType(AircraftType type) {
		this.type = type;
	}

	public AircraftSize getSize() {
		return size;
	}

	public void setSize(AircraftSize size) {
		this.size = size;
	}
	
	public int getPriority() {
		int prio = 0;
		
		if (this.getType() == AircraftType.Emergency)
			prio = 6;
		if (this.getType() == AircraftType.VIP)
			prio = 4;
		if (this.getType() == AircraftType.Passenger)
			prio = 2;
		if (this.getType() == AircraftType.Cargo)
			prio = 0;
		
		if (this.getSize() == AircraftSize.Large )
			prio++;
		return prio;
		 
	}
	
	
}
