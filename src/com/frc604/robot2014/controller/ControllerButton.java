package com.frc604.robot2014.controller;

import edu.wpi.first.wpilibj.Joystick;

public class ControllerButton {
	
    private final Joystick joystick;
    private final int button;
    
    public ControllerButton (Joystick joystick, int button) {
        this.joystick = joystick;
        this.button = button;
    }
    
    public boolean get () {
        return this.joystick.getRawButton(this.button);
    }
}
