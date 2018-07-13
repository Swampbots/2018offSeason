package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by SwampbotsAdmin on 7/8/2018.
 */

public class TestAutonomous extends LinearOpMode {

    public DcMotor leftDrive = null;
    public DcMotor rightDrive = null;

    public void runOpMode() {

        leftDrive = hardwareMap.dcMotor.get("left_motor");
        rightDrive = hardwareMap.dcMotor.get("right_motor");

        telemetry.addLine("Ready.");
        telemetry.addLine("Press play to start.");
        telemetry.update();


        waitForStart();

        telemetry.addLine("Driving forward...");
        telemetry.update();

        leftDrive.setPower(0.5);
        rightDrive.setPower(0.5);

        sleep(2000);

        leftDrive.setPower(0);
        rightDrive.setPower(0);


        telemetry.addLine("Finished.");
        telemetry.update();
    }
}
