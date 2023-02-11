// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */

  private final CANSparkMax leftMaster = new CANSparkMax(1, MotorType.kBrushless);
  private final CANSparkMax rightMaster = new CANSparkMax(3, MotorType.kBrushless);

  private final CANSparkMax leftSlave = new CANSparkMax(2, MotorType.kBrushless);
  private final CANSparkMax rightSlave = new CANSparkMax(4, MotorType.kBrushless);
 
  public Drivetrain() {
    leftSlave.follow(leftMaster);
    rightSlave.follow(rightSlave);

    // Invert right motor so when motors spin clockwise, we move forward. 
    leftMaster.setInverted(false);
    rightMaster.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
