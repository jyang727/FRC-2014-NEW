package com.frc604.robot2014;

import com.frc604.robot2014.action.ShiftDown;
import com.frc604.robot2014.action.ShiftUp;
import com.frc604.robot2014.action.Takein;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI {

	private Joystick driver = new Joystick(1);
	
	private Joystick manipulator = new Joystick(3);

	public OI() {
		
	    SmartDashboard.putData("Shift_Up", new ShiftUp());
	    SmartDashboard.putData("Shift_Down", new ShiftDown());
	    
	       // Create some buttons
        JoystickButton leftBumpper = new JoystickButton(driver, 5);
        JoystickButton rightBumpper = new JoystickButton(driver, 6);
        
        leftBumpper.whenPressed(new ShiftUp());
        rightBumpper.whenPressed(new ShiftDown());
        
        JoystickButton button2 = new JoystickButton(manipulator, 2);
        button2.whenPressed(new Takein());
	}
	
	public Joystick getDriver() {
	    return driver;
	}
}
