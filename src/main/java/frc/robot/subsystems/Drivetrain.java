// RobotBuilder Version: 3.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot.subsystems;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Drivetrain extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
    public static final String PlaceDistance = "";
    public static final String BackAwayDistance = "";

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private PWMTalonSRX left2;
    private PWMTalonSRX left1;
    private SpeedControllerGroup leftMotor;
    private PWMTalonSRX right2;
    private PWMTalonSRX right1;
    private SpeedControllerGroup rightMotor;
    private DifferentialDrive drive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
    *
    */
    public Drivetrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        left2 = new PWMTalonSRX(2);
        addChild("Left2", left2);
        left2.setInverted(false);
// 2 and 5 are left drive
        left1 = new PWMTalonSRX(1);
        addChild("Left1", left1);
        left1.setInverted(false);

        SpeedControllerGroup leftMotor = new SpeedControllerGroup(left1, left2);
        addChild("LeftMotor", leftMotor);

        right2 = new PWMTalonSRX(4);
        addChild("Right2", right2);
        right2.setInverted(false);
// 1 and 4 are right
        right1 = new PWMTalonSRX(3);
        addChild("Right1", right1);
        right1.setInverted(false);

        SpeedControllerGroup rightMotor = new SpeedControllerGroup(right1, right2);
        addChild("RightMotor", rightMotor);

        drive = new DifferentialDrive(leftMotor, rightMotor);
        addChild("Drive", drive);
        drive.setSafetyEnabled(true);
        drive.setExpiration(0.1);
        drive.setMaxOutput(0.4);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void drive(double left, double right) {
        drive.tankDrive(left, right);
    }
}
