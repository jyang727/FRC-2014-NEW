package com.frc604.robot2014.component;

public enum ComponentId {

	Drive("Drive"),
	Shifter("Shifter"),
	Intake("Intake"),
	Pivot("Pivot"),	
	Flower("Flower"),
	Pneumatic("Pneumatic"),
	Shooter("Shooter");

	private String id;
	
	ComponentId(String id){
		
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
}
