package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by SwampbotsAdmin on 6/24/2018.
 */

@TeleOp(name = "Test TeleOp", group = "Testing")
public class TestTeleOp extends OpMode {

    public void init() {

    }

    public void loop() {
        telemetry.addLine("Is is thing working?");
    }

}
