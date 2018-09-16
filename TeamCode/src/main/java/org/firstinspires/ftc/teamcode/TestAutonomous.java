package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by SwampbotsAdmin on 7/8/2018.
 */

@Autonomous(name = "Test Autonomous", group = "Testing")
public class TestAutonomous extends LinearOpMode {

    public DcMotor leftDrive = null;
    public DcMotor rightDrive = null;


    public void runOpMode() {

        leftDrive = hardwareMap.dcMotor.get("left_motor");
        rightDrive = hardwareMap.dcMotor.get("right_motor");

        leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);

        telemetry.addLine("Ready.");
        telemetry.addLine("Press play to start.");
        telemetry.update();


        waitForStart();

        while(opModeIsActive()) {}
    }
}
