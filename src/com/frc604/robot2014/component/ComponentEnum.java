/**
 * 
 */
package com.frc604.robot2014.component;

/**
 * @author jyang
 *
 */
public class ComponentEnum {
	
	public static ComponentEnum Drive      = new ComponentEnum("Comp_Drive");
	public static ComponentEnum Intake     = new ComponentEnum("Comp_Intake");
	public static ComponentEnum Flower     = new ComponentEnum("Comp_Flower");
	public static ComponentEnum Pivot      = new ComponentEnum("Comp_Pivot");
	public static ComponentEnum Shifter    = new ComponentEnum("Comp_Shifter");
	public static ComponentEnum Pneumatics = new ComponentEnum("Comp_Pneumaics");
	public static ComponentEnum Shooter    = new ComponentEnum("Comp_Shooter");
	
	private String id;
	
	private ComponentEnum(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}
}
