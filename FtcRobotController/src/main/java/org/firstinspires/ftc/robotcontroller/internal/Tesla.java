package org.firstinspires.ftc.robotcontroller.internal;

/**
 * Created by khenr on 11/18/2016.
 */

public class Tesla extends Corvette {
    public void main() throws InterruptedException{

        // drive forward
        leftMotor.setPower(1);
        rightMotor.setPower(1);
        Thread.sleep(3000);

        // turn left
        backMotor.setPower(-1);
        leftMotor.setPower(-1);
        rightMotor.setPower(-1);
        Thread.sleep(3000);

        // line up
        backMotor.setPower(0);
        leftMotor.setPower(1);
        rightMotor.setPower(1);
        Thread.sleep(3000);

        // shoot

        leftMotor.setPower(0);
        rightMotor.setPower(0);
        D_angello.setPower(1);

        // tip the capball
        D_angello.setPower(0);
        leftMotor.setPower(1);
        rightMotor.setPower(1);

        // stop
        leftMotor.setPower(0);
        rightMotor.setPower(0);

    }
}
