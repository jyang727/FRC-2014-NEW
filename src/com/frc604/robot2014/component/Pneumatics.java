package com.frc604.robot2014.component;

import edu.wpi.first.wpilibj.Compressor;

public class Pneumatics extends BaseComponent {

	private final Compressor compressor = new Compressor(5, 1);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Start the compressor
	 */
	public void start(){
		
		compressor.start();
	}
	
	/**
	 * Stop the compressor
	 * 
	 */
	public void stop() {
		compressor.stop();
	}

	@Override
	public void log() {
		// TODO Auto-generated method stub
		
	}
	
}
