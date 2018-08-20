package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by SwampbotsAdmin on 8/19/2018.
 */

@TeleOp(name = "Mecanum test")
public class MecanumTest extends OpMode {

    public DcMotor frontLeftDrive = null;
    public DcMotor frontRightDrive = null;
    public DcMotor rearLeftDrive = null;
    public DcMotor rearRightDrive = null;

    public final double SLOW = 0.1;
    public final double NORMAL = 0.2;
    public final double FAST = 0.4;

    public void init(){
        frontLeftDrive = hardwareMap.dcMotor.get("fl_motor");
        frontRightDrive = hardwareMap.dcMotor.get("fr_motor");
        rearLeftDrive = hardwareMap.dcMotor.get("rl_motor");
        rearRightDrive = hardwareMap.dcMotor.get("rr_motor");

        frontLeftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        rearLeftDrive.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    public void loop() {

        double driverSpeedMod;

        if(gamepad1.left_bumper)        driverSpeedMod = FAST;
        else if(gamepad1.right_bumper)  driverSpeedMod = SLOW;
        else                            driverSpeedMod = NORMAL;

        // Wheel speeds
        double frontLeft = driverSpeedMod;
        double frontRight = driverSpeedMod;
        double rearLeft = driverSpeedMod;
        double rearRight = driverSpeedMod;

        // Do the math
        frontLeft = ((-gamepad1.left_stick_y) + gamepad1.left_stick_x + gamepad1.right_stick_x);
        frontRight = ((-gamepad1.left_stick_y) - gamepad1.left_stick_x - gamepad1.right_stick_x);
        rearLeft = ((-gamepad1.left_stick_y) + gamepad1.left_stick_x - gamepad1.right_stick_x);
        rearRight = ((-gamepad1.left_stick_y) - gamepad1.left_stick_x + gamepad1.right_stick_x);

        // Set the power
        frontLeftDrive.setPower(frontLeft * driverSpeedMod);
        frontRightDrive.setPower(frontRight * driverSpeedMod);
        rearLeftDrive.setPower(rearLeft * driverSpeedMod);
        rearRightDrive.setPower(rearRight * driverSpeedMod);

        telemetry.addData("Left stick x", gamepad1.left_stick_x);
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        telemetry.addData("Sum", gamepad1.left_stick_x + gamepad1.left_stick_y);
        telemetry.addLine();
        telemetry.addData("frontLeft", frontLeft);
        telemetry.addData("frontRight", frontRight);
        telemetry.addData("rearLeft", rearLeft);
        telemetry.addData("rearRight", rearRight);

    }
}
