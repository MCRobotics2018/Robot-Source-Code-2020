/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.Indexer;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.LimeLight;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Intake;
import frc.robot.commands.IndexerCommand;
import frc.robot.commands.FireCommand;
import frc.robot.commands.LimelightAutoAlign;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.IntakeFwdCommand;
import frc.robot.commands.IntakeRevCommand;



// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class Autonomous extends SequentialCommandGroup {
    final DoubleSupplier move = () -> Math.abs(0.0);
    final DoubleSupplier turn = () -> Math.abs(0.6);
  /**
   * Creates a new Autonomous.
   */
  public Autonomous(DriveTrain driveTrain, LimeLight limeLight, Indexer indexer, Shooter shooter, Intake intake) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    //super();
    //final DoubleSupplier move = () -> Math.abs(0.0);
    //final DoubleSupplier turn = () -> Math.abs(0.6);
    
    //super (new FireCommand(indexer, shooter), new FireCommand(indexer, shooter), new FireCommand(indexer, shooter));
    
    addCommands(
      //new DriveCommand(driveTrain, move, turn, throttle)
      //new LimelightAutoAlign(driveTrain, limeLight, move, turn),
      //new FireCommand(indexer, shooter),
      //new FireCommand(indexer, shooter),
      //new FireCommand(indexer, shooter)

      //test
      new IntakeFwdCommand(intake),
      new WaitCommand(2),
      new IntakeFwdCommand(intake),
      new WaitCommand(2),
      new IntakeRevCommand(intake),
      new WaitCommand(2),
      new IntakeRevCommand(intake)

    ); 
  }
}