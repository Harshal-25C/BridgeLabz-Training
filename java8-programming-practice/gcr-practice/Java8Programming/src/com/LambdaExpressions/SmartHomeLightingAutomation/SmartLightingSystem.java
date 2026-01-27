package com.LambdaExpressions.SmartHomeLightingAutomation;

import java.util.HashMap;
import java.util.Map;

public class SmartLightingSystem {

    public static void main(String[] args) {

        Map<String, LightAction> triggers = new HashMap<>();

        triggers.put("MOTION", () -> System.out.println("Lights ON at 100% brightness"));

        triggers.put("NIGHT", () -> System.out.println("Lights ON at 30% warm mode"));

        triggers.put("VOICE", () -> System.out.println("Voice command: Lights set to blue mood"));

        //Simulate triggers
        triggers.get("MOTION").execute();
        triggers.get("NIGHT").execute();
        triggers.get("VOICE").execute();
    }
}
