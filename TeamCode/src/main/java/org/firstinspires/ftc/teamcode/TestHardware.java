package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by SwampbotsAdmin on 6/24/2018.
 */

public class TestHardware {

    public DcMotor leftMotor    = null;
    public DcMotor rightMotor   = null;

    HardwareMap hwMap = null;

    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;

        // Get the motors
        leftMotor = hwMap.dcMotor.get("left_motor");
        rightMotor = hwMap.dcMotor.get("right_motor");

        // Set the motor directions
        leftMotor   .setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotor  .setDirection(DcMotorSimple.Direction.REVERSE);

        // Set the motor powers to 0
        leftMotor   .setPower(0);
        rightMotor  .setPower(0);

        // Set the behavior of the motors when the power is set to zero
        leftMotor   .setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        rightMotor  .setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);

        // Set the run mode
        leftMotor   .setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightMotor  .setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}
