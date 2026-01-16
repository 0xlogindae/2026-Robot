package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.UnpaidIntern;

public class Intake extends SubsystemBase {
    private final TalonFX motor;
    private static final double DEADBAND = 0;

    public Intake(int motorCANId) {
        motor = new TalonFX(motorCANId);
        UnpaidIntern.zeroEncoder(motor);
    }

    public void set(double speed) {
        UnpaidIntern.setPercentWithDeadband(motor, speed, DEADBAND);
    }

    public void stop() {
        UnpaidIntern.stop(motor);
    }

    public void kill() {
        UnpaidIntern.killMotor(motor);
    }

    public TalonFX getMotor() {
        return motor;
    }
}