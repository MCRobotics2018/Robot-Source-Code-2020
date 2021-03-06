/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

//AUTO rotate the FRC COlor WHeel for the specified number of rotations based on wheel and motor wheel diameters.

package frc.robot.commands.ColorWheelCommands;

import frc.robot.subsystems.ColorWheelSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RotateColorWheelCommand extends CommandBase {
  private final ColorWheelSubsystem m_WheelSubsystem;
  /**
   * Creates a new ColorWheelCommand.
   */
  public RotateColorWheelCommand(ColorWheelSubsystem WheelSubsystem) {
    super();
    m_WheelSubsystem=WheelSubsystem;
    addRequirements(m_WheelSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Rotate-CW-CMD-Init");
    m_WheelSubsystem.init(); //initialize CW encoder to 0 each time

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_WheelSubsystem.startRevolutions();
    System.out.println("Rotate-CW-CMD-start");
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    System.out.println("Rotate-CW-CMD-END");
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
        //While the # of revolutions is < kEncReveolutions, return false to continue command
      if (m_WheelSubsystem.isRunning()) {
          return false;
       }
       else {
          return true;
       }
  }
}
