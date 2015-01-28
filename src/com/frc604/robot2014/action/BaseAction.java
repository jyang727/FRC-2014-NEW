package com.frc604.robot2014.action;

import com.frc604.robot2014.ComponentManager;
import com.frc604.robot2014.component.BaseComponent;
import com.frc604.robot2014.component.ComponentEnum;

import edu.wpi.first.wpilibj.command.Command;

public abstract class BaseAction extends Command {
	
	ComponentManager cm = ComponentManager.getInstance();
	
	protected BaseComponent getComponent(ComponentEnum key){
		
		return cm.getComponent(key);
	}

}
