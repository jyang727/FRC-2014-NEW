package com.frc604.robot2014.component;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Shifter extends BaseComponent {

	private final DoubleSolenoid solenoid = new DoubleSolenoid(1, 2);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Shift to low gear
	 */
	public void lowGear(){
		
		solenoid.set(Value.kReverse);
	}
	
	/**
	 * Shift to high gear
	 */
	public void highGear(){
		solenoid.set(Value.kForward);
	}

	@Override
	public void log() {
		// TODO Auto-generated method stub
		
	}
}
