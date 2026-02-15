package com.workshop;

import java.time.LocalTime;

public class AmbulanceService implements TransportService, EmergencyService {

    public String getServiceName() { return "Ambulance"; }
    public String getRoute() { return "Emergency Route"; }
    public double getFare() { return 0; }
    public LocalTime getDepartureTime() { return LocalTime.now(); }
}

