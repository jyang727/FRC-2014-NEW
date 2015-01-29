package com.frc604.robot2014.controller;

import edu.wpi.first.wpilibj.Joystick;

public class XboxControllerStick {
    public final ControllerAxis X;
    public final ControllerAxis Y;
    
    public XboxControllerStick (Joystick joystick, int x, int y) {
        this.X = new ControllerAxis(joystick, x);
        this.Y = new ControllerAxis(joystick, y);
    }
}