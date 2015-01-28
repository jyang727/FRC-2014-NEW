package com.frc604.robot2014.component;

import edu.wpi.first.wpilibj.Solenoid;

public class Flower extends BaseComponent {
	
    private final Solenoid top = new Solenoid(4);
    private final Solenoid sides = new Solenoid(5);
    private final Solenoid bottom = new Solenoid(3);	

	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 *  close the flower
	 * 
	 */
	public void close(){
		
        top.set(false);
        sides.set(false);
        bottom.set(false);
	}
	
	/**
	 * Open the flower
	 */
	public void open() {
		
        top.set(true);
        sides.set(true);
        bottom.set(true);		
	}

	/**
	 * Get ready to pickup the ball from the floor
	 */
	public void pickup(){
		
        top.set(true);
        sides.set(true);
        bottom.set(false);		
	}
	
	/**
	 * Get ready to shoot
	 */
	public void shoot(){
		
        top.set(true);
        sides.set(false);
        bottom.set(false);		
	}

	public void log() {
		// TODO Auto-generated method stub
		
	}
}
