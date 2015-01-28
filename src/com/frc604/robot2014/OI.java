package com.frc604.robot2014;

import com.frc604.robot2014.action.ShiftDown;
import com.frc604.robot2014.action.ShiftUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI {

	private Joystick driver = new Joystick(0);

	public OI() {
		
	    SmartDashboard.putData("Shift_Up", new ShiftUp());
	    SmartDashboard.putData("Shift_Down", new ShiftDown());
	    
	       // Create some buttons
        JoystickButton leftBumpper = new JoystickButton(driver, 5);
        JoystickButton rightBumpper = new JoystickButton(driver, 6);
        
        leftBumpper.whenPressed(new ShiftUp());
        rightBumpper.whenPressed(new ShiftDown());
        
	}
	
	public Joystick getDriver() {
	    return driver;
	}
}
