package com.stream_api.iot_sensor_reading;
import java.util.*;
import java.util.stream.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<SensorReading> sensorReadings = Arrays.asList(
		        new SensorReading("SENSOR_1", 22.5),
		        new SensorReading("SENSOR_2", 45.8),
		        new SensorReading("SENSOR_3", 18.3),
		        new SensorReading("SENSOR_4", 67.2),
		        new SensorReading("SENSOR_5", 34.9),
		        new SensorReading("SENSOR_6", 80.1),
		        new SensorReading("SENSOR_7", 29.4),
		        new SensorReading("SENSOR_8", 55.6),
		        new SensorReading("SENSOR_9", 41.0),
		        new SensorReading("SENSOR_10", 72.8)
		);
		
		double threshold_value = 55;
		
		sensorReadings.stream()
		              .filter(s -> s.getValue() > threshold_value)
		              .forEach(System.out::println);
		
	}

}
