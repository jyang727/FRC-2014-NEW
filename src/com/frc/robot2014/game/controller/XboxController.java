package com.frc.robot2014.game.controller;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class XboxController {

	private Joystick joystick = null;
	
	public final JoystickButton A;
	public final JoystickButton B;
	public final JoystickButton X;
	public final JoystickButton Y;
	public final JoystickButton LB;
	public final JoystickButton RB;
	public final JoystickButton Back;
		
    public final ControllerStick leftStick;
    public final ControllerStick rightStick;	
	
	public XboxController(int port){
		
		joystick = new Joystick(port);
		
		A          = new JoystickButton(joystick, 1);
		B          = new JoystickButton(joystick, 2);
		X          = new JoystickButton(joystick, 3);
		Y          = new JoystickButton(joystick, 4);
		LB         = new JoystickButton(joystick, 5);
		RB         = new JoystickButton(joystick, 6);
		Back       = new JoystickButton(joystick, 7);
			
	    leftStick  = new ControllerStick(joystick, 1, 2);
	    rightStick = new ControllerStick(joystick, 4, 5);		
	}
	
}
