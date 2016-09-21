package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

/**
 * Created by khenr on 9/21/2016.
 */
public abstract class  Corvette extends OpMode {
    private DcMotorController dc_drive__controller;

    private DcMotor driveRight;
    private DcMotor driveLeft;

    @Override
    public void int() {
        dc_drive__controller = hardwareMap.dcMotorController.get("drive_controller");
        driveLeft = hardwareMap.dcMotor.get("drive_left");
        driveRight = hardwareMap.dcMotor.get("drive_right");
    }

    @Override
    public void loop() {
        driveLeft.setPower(gamepad1.left_stick_y);
        driveRight.setPower(gamepad2.right_stick_y);
    }


}
