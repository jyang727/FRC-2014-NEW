package com.frc604.robot2014;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.frc604.robot2014.command.Autonomous;
import com.frc604.robot2014.component.BaseComponent;
import com.frc604.robot2014.component.ComponentId;
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
	
	Map<ComponentId, BaseComponent> components = null;
	
	private Command autonomousCommand;
	
	public void robotInit() {
		
		// Initialize the subsystems
		components = new HashMap<ComponentId, BaseComponent>();
		
		// initialize the Drive subsystem
		Drive drive = new Drive();
		components.put(ComponentId.Drive, drive);
		SmartDashboard.putData(drive);
				
		// initialize the Flower subsystem
		Flower flower = new Flower();
		components.put(ComponentId.Flower, flower);
		SmartDashboard.putData(flower);
		
		// initialize the Intake subsystem
		Intake intake = new Intake();
		components.put(ComponentId.Intake, intake);
		SmartDashboard.putData(intake);
		
		// initialize the Pivot subsystem
		Pivot pivot = new Pivot();
		components.put(ComponentId.Pivot, pivot);
		SmartDashboard.putData(pivot);		
		
		// initialize the Shifter subsystem
		Shifter shifter = new Shifter();
		components.put(ComponentId.Shifter, shifter);
		SmartDashboard.putData(shifter);
		
		// initialize the Pneumatics subsystem
		Pneumatics pneumatics = new Pneumatics();
		components.put(ComponentId.Pneumatic, pneumatics);
		SmartDashboard.putData(pneumatics);		
		
		// initialize the Shooter subsystem
		Shooter shooter = new Shooter();
		components.put(ComponentId.Pneumatic, shooter);
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
    
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        log();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }    
	
	public void log(){
		
		if (this.components == null){
			return;
		}
		
		Iterator<ComponentId> itr = components.keySet().iterator();
		
		while (itr.hasNext()){
			ComponentId key = (ComponentId)itr.next();
			BaseComponent bc = components.get(key);
			if (bc!=null){
				bc.log();
			}
		}
	}
}
