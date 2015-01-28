package com.frc604.robot2014.component;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Drive extends BaseComponent {
	
    private final RobotDrive drive = new RobotDrive(2, 1);
    
    private final Encoder leftEncoder = new Encoder(2, 1);
    private final Encoder rightEncoder = new Encoder(3, 4);
    
    private final PIDController pid = new PIDController(0.005, 0D, 0.005, leftEncoder, new PIDOutput () {
        public void pidWrite (double output) {
            drive.setLeftRightMotorOutputs(output, output);
        }
    });
    
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	    leftEncoder.setPIDSourceParameter(PIDSourceParameter.kDistance);
	    rightEncoder.setPIDSourceParameter(PIDSourceParameter.kDistance);
	        
	    leftEncoder.start();
	    rightEncoder.start();
	        
	    pid.setAbsoluteTolerance(25);
	    SmartDashboard.putData("Drive PID", pid);		
	}	
	
    public void tankDrive(double leftAxis, double rightAxis){
    	
    	drive.tankDrive(leftAxis, rightAxis);
    }
    
    public void stop(){
    	drive.tankDrive(0, 0);
    }
    
    public void log(){
    	
    }
}
