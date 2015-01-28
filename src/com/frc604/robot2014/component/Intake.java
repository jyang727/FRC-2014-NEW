package com.frc604.robot2014.component;

import edu.wpi.first.wpilibj.Victor;

public class Intake extends BaseComponent {

	private final Victor motor = new Victor(5);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Turn on the motor
	 * 
	 */
	public void On(){
		motor.set(-1.0d);
	}
	
	/**
	 * Turn off the motor
	 */
	public void Off(){
		motor.stopMotor();
	}

	@Override
	public void log() {
		// TODO Auto-generated method stub
		
	}
	
}
