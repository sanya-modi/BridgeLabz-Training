package com.stream_api.iot_sensor_reading;

public class SensorReading {
	
	String sensorId;
	double value;
	
	public SensorReading(String sensorId, double value) {
		this.sensorId = sensorId;
		this.value = value;
	}

	public String getSensorId() {
		return sensorId;
	}

	public double getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "sensorId:" + sensorId + ", value:" + value ;
	}
	
	

}
