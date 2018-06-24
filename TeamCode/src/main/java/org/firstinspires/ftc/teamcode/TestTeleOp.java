package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by SwampbotsAdmin on 6/24/2018.
 */

@TeleOp(name = "Test TeleOp", group = "Testing")
public class TestTeleOp extends OpMode {

    TestHardware hardware = new TestHardware();

    public void init() {
        hardware.init(hardwareMap);
    }

    public void loop() {
        telemetry.addLine("Is is thing working?");

        hardware.leftMotor  .setPower(gamepad1.left_stick_y);
        hardware.rightMotor .setPower(gamepad1.right_stick_y);
    }

}
