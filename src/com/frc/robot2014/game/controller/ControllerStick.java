package com.frc.robot2014.game.controller;

import edu.wpi.first.wpilibj.Joystick;

public class ControllerStick {

	public final ControllerAxis X;
	public final ControllerAxis Y;
	    
	public ControllerStick (Joystick joystick, int x, int y) {
	
		this.X = new ControllerAxis(joystick, x);
	    this.Y = new ControllerAxis(joystick, y);
	}
}
