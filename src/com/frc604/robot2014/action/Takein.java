package com.frc604.robot2014.action;

import com.frc604.robot2014.component.ComponentEnum;
import com.frc604.robot2014.component.Intake;

public class TakeIn extends BaseAction {
	
	public TakeIn(){
		requires(getComponent(ComponentEnum.Intake));
	}

	protected void end() {
		// TODO Auto-generated method stub
		
	}

	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	protected void initialize() {
		// TODO Auto-generated method stub
		Intake intake = (Intake)getComponent(ComponentEnum.Intake);
		intake.on();
	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
