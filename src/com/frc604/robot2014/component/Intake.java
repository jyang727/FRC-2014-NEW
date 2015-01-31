package com.frc604.robot2014.component;

import edu.wpi.first.wpilibj.Victor;

public class Intake extends BaseComponent {

	private final Victor motor = new Victor(5);
	
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Turn on the motor
	 * 
	 */
	public void on(){
		motor.set(-1.0d);
	}
	
	/**
	 * Turn on the motor
	 * 
	 */
	public void reverse(){
		motor.set(1.0d);
	}
	
	/**
	 * Turn off the motor
	 */
	public void off(){
		motor.stopMotor();
	}

	public void log() {
		// TODO Auto-generated method stub
		
	}
	
}
