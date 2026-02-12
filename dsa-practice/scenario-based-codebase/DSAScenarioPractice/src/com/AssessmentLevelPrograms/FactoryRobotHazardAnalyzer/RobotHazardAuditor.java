package com.AssessmentLevelPrograms.FactoryRobotHazardAnalyzer;
import java.util.*;

public class RobotHazardAuditor {

    public double CalculateHazardRisk(double armPrecision, int workerDensity, 
    		String machineryState) throws RobotSafetyException {

        // Validate armPrecision
        if(armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException(
                    "Error: Arm precision must be 0.0-1.0"
            );
        }

        // Validate workerDensity
        if(workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException(
                    "Error: Worker density must be 1-20"
            );
        }

        // Validate machineryState (case-sensitive)
        double machineRiskFactor;

        switch (machineryState) {
            case "Worn":
                machineRiskFactor = 1.3;
                break;
            case "Faulty":
                machineRiskFactor = 2.0;
                break;
            case "Critical":
                machineRiskFactor = 3.0;
                break;
            default:
                throw new RobotSafetyException(
                        "Error: Unsupported machinery state"
                );
        }

        // Hazard Risk Formula
        double hazardRisk = ((1.0 - armPrecision)*15.0) + (workerDensity*machineRiskFactor);

        return hazardRisk;
    }
}
