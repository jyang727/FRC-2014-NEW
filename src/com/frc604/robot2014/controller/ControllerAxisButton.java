package com.frc604.robot2014.controller;

import com.sun.squawk.util.MathUtils;
import edu.wpi.first.wpilibj.Joystick;

public class ControllerAxisButton {
    private final Joystick joystick;
    private final int axis;
    
    private final int direction;
    
    public ControllerAxisButton (Joystick joystick, int axis, int direction) {
        this.joystick = joystick;
        this.axis = axis;
        
        this.direction = direction;
    }
    
    public boolean get () {
        return MathUtils.round(this.joystick.getRawAxis(this.axis)) == this.direction;
    }
}
