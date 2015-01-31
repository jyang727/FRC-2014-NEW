package com.frc604.robot2014.action;

import com.frc604.robot2014.component.ComponentEnum;
import com.frc604.robot2014.component.Intake;

public class IntakeStop extends BaseAction {

	public IntakeStop(){
		requires(getComponent(ComponentEnum.Intake));
	}
	
	//@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		Intake intake = (Intake)getComponent(ComponentEnum.Intake);
		intake.off();
	}

	//@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	//@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	//@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	//@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
