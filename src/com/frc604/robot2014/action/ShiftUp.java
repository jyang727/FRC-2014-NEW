package com.frc604.robot2014.action;

import com.frc604.robot2014.component.ComponentEnum;
import com.frc604.robot2014.component.Shifter;

public class ShiftUp extends BaseAction {

	protected void end() {
		// TODO Auto-generated method stub
		
	}

	protected void execute() {
		// TODO Auto-generated method stub
		Shifter shifter = (Shifter)getComponent(ComponentEnum.Shifter);
		shifter.highGear();		
	}

	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
