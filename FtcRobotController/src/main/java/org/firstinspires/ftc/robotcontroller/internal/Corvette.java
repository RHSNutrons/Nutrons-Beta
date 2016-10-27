package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

/**
 * Created by khenr & sytect on 9/21/2016.
 */
 public class Corvette extends OpMode{
    public DcMotorController dc_drive_controller;

    public DcMotor rightMotor;
    public DcMotor leftMotor;
    public DcMotor backMotor;


    @Override
    public void init() {
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        backMotor = hardwareMap.dcMotor.get("backMotor");
    }

    @Override
    public void loop() {
        double throttle = gamepad1.left_stick_y;
        double direction = -gamepad1.left_stick_x;

        double right = Math.sin(30)*throttle - Math.cos(30)*direction;
        double left = Math.sin(30)*throttle + Math.cos(30)*direction;
        double back = -direction;

        rightMotor.setPower(2*right);
        leftMotor.setPower(2*left);
        backMotor.setPower(back);
    }

    @Override
    public void stop() {

    }


}
