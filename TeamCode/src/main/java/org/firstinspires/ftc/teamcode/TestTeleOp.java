package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by SwampbotsAdmin on 7/1/2018.
 */

@TeleOp(name = "DC Test", group = "Testing")
public class TestTeleOp extends OpMode {

    public DcMotor leftDrive = null;
    public DcMotor rightDrive = null;

    public void init() {
        leftDrive = hardwareMap.dcMotor.get("left_motor");
        rightDrive = hardwareMap.dcMotor.get("right_motor");
    }

    public void loop() {
        leftDrive.setPower(gamepad1.left_stick_y);
        rightDrive.setPower(gamepad1.right_stick_y);
    }


}
