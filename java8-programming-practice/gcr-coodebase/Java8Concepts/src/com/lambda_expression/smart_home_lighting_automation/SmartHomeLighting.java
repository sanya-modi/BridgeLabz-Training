package com.lambda_expression.smart_home_lighting_automation;

public class SmartHomeLighting {
	
	public static void main(String[] args) {
		
		LightAction motionTrigger = () -> System.out.println("Motion detected : Light ON ");
		
		LightAction timeTrigger = () -> System.out.println("Time of day : Evening");
		
		LightAction voiceTrigger = () -> System.out.println("Voice Commend : Blue light activated");
		
		 executeLightAction(motionTrigger);
	        executeLightAction(timeTrigger);
	        executeLightAction(voiceTrigger);
	    }

	    static void executeLightAction(LightAction action) {
	        action.activate();
	    }
	
}
