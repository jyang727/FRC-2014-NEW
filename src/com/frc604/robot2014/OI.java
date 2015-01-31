package com.frc604.robot2014;

import com.frc.robot2014.game.controller.XboxController;
import com.frc604.robot2014.action.ShiftDown;
import com.frc604.robot2014.action.ShiftUp;
import com.frc604.robot2014.action.SpitOut;
import com.frc604.robot2014.action.TakeIn;
import com.frc604.robot2014.action.IntakeStop;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI {

	private XboxController driver = new XboxController(1);
	
	private XboxController manipulator = new XboxController(3);

	public OI() {
		
	    SmartDashboard.putData("Shift_Up", new ShiftUp());
	    SmartDashboard.putData("Shift_Down", new ShiftDown());
	    
	    bindDriverControls();
	    bindManipulaorControls();
	    
	}
	
	private void bindDriverControls(){
		
        driver.leftStick.X.setFactor(-1);
        driver.rightStick.X.setFactor(-1);
        
        driver.leftStick.Y.setFactor(-1);
        driver.rightStick.Y.setFactor(-1);
        
        driver.leftStick.X.setDeadband(0.2);
        driver.rightStick.X.setDeadband(0.2);
        
        driver.leftStick.Y.setDeadband(0.2);
        driver.rightStick.Y.setDeadband(0.2);
		
		// when left bumper pressed, shift up
		driver.LB.whenPressed(new ShiftUp());
		
		// when right bumper pressed, shift down
		driver.LB.whenPressed(new ShiftDown());
		
		
	}
	
	private void bindManipulaorControls(){
		
		manipulator.LB.whenPressed(new TakeIn());
		manipulator.LB.whenReleased(new IntakeStop());
		
		manipulator.RB.whenPressed(new SpitOut());
		manipulator.RB.whenReleased(new IntakeStop());
	}
	
	public XboxController getDriver() {
	    return driver;
	}
	
	public XboxController getManipulator() {
	    return manipulator;
	}	
}
