package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by SwampbotsAdmin on 7/1/2018.
 */

@TeleOp(name = "DC Test", group = "Testing")
public class TestTeleOp extends OpMode {

    public DcMotor leftDrive = null;
    public DcMotor rightDrive = null;

    public final double SLOW = 0.1;
    public final double NORMAL = 0.2;
    public final double FAST = 0.4;

    public void init() {
        leftDrive = hardwareMap.dcMotor.get("left_motor");
        rightDrive = hardwareMap.dcMotor.get("right_motor");

        leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void loop() {

        double driverSpeedMod;

        if(gamepad1.left_bumper)        driverSpeedMod = FAST;
        else if(gamepad1.right_bumper)  driverSpeedMod = SLOW;
        else                            driverSpeedMod = NORMAL;

        leftDrive.setPower(gamepad1.left_stick_y * driverSpeedMod);
        rightDrive.setPower(gamepad1.right_stick_y * driverSpeedMod);
    }
}
