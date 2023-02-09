// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

//accelomerater in roborio for autonomous balancing

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.TimedRobot;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
//import com.revrobotics.SparkMaxRelativeEncoder;

/**
 * This is a demo program showing the use of the DifferentialDrive class. Runs the motors with
 * arcade steering.
 */
public class Robot extends TimedRobot {
  private final CANSparkMax m_motor = new CANSparkMax(4, MotorType.kBrushless);

  private final XboxController m_stick = new XboxController(0);

  @Override
  public void robotInit() {

  }

  @Override
  public void teleopPeriodic() {
    m_motor.set(m_stick.getRightY());    
  }
}
