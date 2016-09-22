package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

/**
 * Created by khenr on 9/21/2016.
 */
public abstract class  Corvette extends OpMode {
    public DcMotorController dc_drive__controller;

    public DcMotor side1Motor;
    public DcMotor side2Motor;
    public DcMotor side3Motor;

    @Override
    public void int() {
        dc_drive__controller = hardwareMap.dcMotorController.get("drive_controller");
        side1Motor = hardwareMap.dcMotor.get("side1");
        side2Motor = hardwareMap.dcMotor.get("side2");
        side3Motor = hardwareMap.dcMotor.get("Side3");
    }

    @Override
    public void loop() {
        side1Motor.setPower(2.5);
        side2Motor.setPower(2.5);
        side3Motor.setPower(2.5);
    }


}
