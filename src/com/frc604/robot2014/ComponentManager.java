package com.frc604.robot2014;

import java.util.Hashtable;

import com.frc604.robot2014.component.BaseComponent;
import com.frc604.robot2014.component.ComponentEnum;
import com.frc604.robot2014.component.Drive;
import com.frc604.robot2014.component.Flower;
import com.frc604.robot2014.component.Intake;
import com.frc604.robot2014.component.Pivot;
import com.frc604.robot2014.component.Pneumatics;
import com.frc604.robot2014.component.Shifter;
import com.frc604.robot2014.component.Shooter;

public class ComponentManager {

	private static Hashtable components = new Hashtable();
	
	static {
		components.put(ComponentEnum.Drive, new Drive());
		components.put(ComponentEnum.Shifter, new Shifter());
		components.put(ComponentEnum.Intake, new Intake());
		components.put(ComponentEnum.Pivot, new Pivot());
		components.put(ComponentEnum.Flower, new Flower());
		components.put(ComponentEnum.Pneumatics, new Pneumatics());
		components.put(ComponentEnum.Shooter, new Shooter());
	}
	
	private static ComponentManager instance = new ComponentManager();
	
	private ComponentManager(){
	}
	
	public static ComponentManager getInstance(){
		return instance;
	}
	
	public BaseComponent getComponent(ComponentEnum key){

		BaseComponent bc = (BaseComponent)components.get(key);
	
		return bc;
	}
}
