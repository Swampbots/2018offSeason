package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class OCVTest extends LinearOpMode {



    @Override
    public void runOpMode() throws InterruptedException {


        waitForStart();


        while(opModeIsActive()) {
            telemetry.addLine("Is this thing on?");
        }
    }
}
