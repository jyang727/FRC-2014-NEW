package com.frc604.robot2014;

import com.frc604.robot2014.action.Autonomous;
import com.frc604.robot2014.component.ComponentEnum;
import com.frc604.robot2014.component.Drive;
import com.frc604.robot2014.component.Flower;
import com.frc604.robot2014.component.Intake;
import com.frc604.robot2014.component.Pivot;
import com.frc604.robot2014.component.Pneumatics;
import com.frc604.robot2014.component.Shifter;
import com.frc604.robot2014.component.Shooter;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot2014 extends IterativeRobot {
	
	public static OI oi;
	
	private Command autonomousCommand;
	
	ComponentManager cm = ComponentManager.getInstance();
	
	public void robotInit() {
		
		// initialize the Drive subsystem
		Drive drive = (Drive)cm.getComponent(ComponentEnum.Drive);
		SmartDashboard.putData(drive);
				
		// initialize the Flower subsystem
		Flower flower = (Flower)cm.getComponent(ComponentEnum.Flower);
		SmartDashboard.putData(flower);
		
		// initialize the Intake subsystem
		Intake intake =(Intake)cm.getComponent(ComponentEnum.Intake);
		SmartDashboard.putData(intake);
		
		// initialize the Pivot subsystem
		Pivot pivot = (Pivot)cm.getComponent(ComponentEnum.Pivot);
		SmartDashboard.putData(pivot);		
		
		// initialize the Shifter subsystem
		Shifter shifter = (Shifter)cm.getComponent(ComponentEnum.Shifter);
		SmartDashboard.putData(shifter);
		
		// initialize the Pneumatics subsystem
		Pneumatics pneumatics = (Pneumatics)cm.getComponent(ComponentEnum.Pneumatics);
		SmartDashboard.putData(pneumatics);		
		
		// initialize the Shooter subsystem
		Shooter shooter = (Shooter)cm.getComponent(ComponentEnum.Shooter);
		SmartDashboard.putData(shooter);		
		
        // instantiate the command used for the autonomous period
        autonomousCommand = new Autonomous();
		
		// This MUST be here. If the OI creates Commands (which it very likely
		// will), constructing it during the construction of CommandBase (from
		// which commands extend), subsystems are not guaranteed to be
		// yet. Thus, their requires() statements may grab null pointers. Bad
		// news. Don't move it.
		oi = new OI();
		
		// TODO: instantiate the command used for the autonomous period
		
		// Pressurize the pneumatics.
		// pneumatics.start(); 
		
	}
	
	public void autonomousInit() {
		autonomousCommand.start();
	}

	// This function is called periodically during autonomous
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		log();
	}	
	
    public void teleopInit() {
    	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        autonomousCommand.cancel();
    }	
    
    // This function is called periodically during operator control
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        log();
    }
    
    // This function is called periodically during test mode
    public void testPeriodic() {
        LiveWindow.run();
    }    
	
	public void log(){
		
		cm.getComponent(ComponentEnum.Drive).log();
		cm.getComponent(ComponentEnum.Intake).log();
		cm.getComponent(ComponentEnum.Shifter).log();
		cm.getComponent(ComponentEnum.Flower).log();
		cm.getComponent(ComponentEnum.Pivot).log();
		cm.getComponent(ComponentEnum.Pneumatics).log();
		cm.getComponent(ComponentEnum.Shooter).log();
	}
}
