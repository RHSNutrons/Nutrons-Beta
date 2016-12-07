package org.firstinspires.ftc.robotcontroller.internal;

/**
 * Created by khenr on 11/18/2016.
 */

public class Tesla extends Corvette {
    public void runOpMode() throws InterruptedException {
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        backMotor = hardwareMap.dcMotor.get("backMotor");
        D_angello = hardwareMap.dcMotor.get("ice in my veins");
    }

    public void run() throws  InterruptedException{
        Driveforward(1,1000);
        Turnleft(1, 1000);
        Driveforward(1,1000);
        Shoot(1,300);
        Driveforward(1,1000);
    }
    @Override
    public void stop(){

    }
    // self explanatory
    public void Driveforward(int Power, int Time) throws InterruptedException{
        leftMotor.setPower(Power);
        rightMotor.setPower(Power);
        Thread.sleep(Time);
    }
    public void Turnleft(int Power, int Time) throws  InterruptedException{
        backMotor.setPower(Power);
        Thread.sleep(Time);
    }
    public void Shoot(int Power, int Time) throws  InterruptedException{
        D_angello.setPower(Power);
        Thread.sleep(Time);
    }

}