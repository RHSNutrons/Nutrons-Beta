package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by khenr & sytect on 9/21/2016.
 */


 public class Corvette extends LinearOpMode {
    public DcMotorController dc_drive_controller;

    public DcMotor rightMotor;
    public DcMotor leftMotor;
    public DcMotor backMotor;
    public DcMotor D_angello;
    public DcMotor inTake;
    public DcMotor inTake2;
    public Servo ramp;
    public Servo ramp2;


    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initialization");
        telemetry.update();
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        backMotor = hardwareMap.dcMotor.get("backMotor");
        /*D_angello = hardwareMap.dcMotor.get("shooter");
        inTake = hardwareMap.dcMotor.get("Intake");
        inTake2 = hardwareMap.dcMotor.get("Intake2");
        ramp = hardwareMap.servo.get("ramp");
        ramp2 = hardwareMap.servo.get("second ramp");*/

        waitForStart();

        while (opModeIsActive()) {
            // telementary my dear watson
            double throttle = gamepad1.left_stick_y; // throttle
            double direction = gamepad1.right_stick_x; // direction

            /*
            if(throttle>=0.2&&direction>=0.2){
                throttle=1;
                direction=1;
            }else if(throttle>=0.2&&direction<=-0.2){
                throttle=1;
                direction=-1;
            }else if(throttle<=-0.2&&direction>=0.2){
                throttle=-1;
                direction=1;
            }else if(throttle<=-0.2&&direction<=-0.2){
                throttle=-1;
                direction=-1;
            }
            */

            double left = Math.cos(150) * direction + Math.sin(150) * throttle;
            double right = Math.cos(30) * direction - Math.sin(30) * throttle;
            double back = direction;

            rightMotor.setPower(right);
            leftMotor.setPower(left);
            backMotor.setPower(back);

            /*
            if (gamepad2.b) {
                D_angello.setPower(-.25); // 25 % motor speed

            }
            if (gamepad2.a) {
                D_angello.setPower(-.5); // 50 % motor speed
            }
            if (gamepad2.x) {
                D_angello.setPower(-.75); // 75 % motor speed
            }
            if (gamepad2.y) {
                D_angello.setPower(-1); // 100 % motor speed
            }
            if (gamepad2.dpad_down) { // stop
                D_angello.setPower(-0);
            }


            //intake
            if (gamepad2.left_trigger == 1) {
                inTake.setPower(-1.0);
                inTake2.setPower(-1.0);
            }
            if (gamepad2.right_trigger == 1) {
                inTake.setPower(0);
                inTake2.setPower(0);
            }
            if (gamepad2.dpad_up) {
                ramp.setPosition(1);
                ramp2.setPosition(1);
            }
            if (gamepad2.dpad_left) {
                ramp.setPosition(0);
                ramp2.setPosition(0);
            }*/

            idle();
        }
    }
}


