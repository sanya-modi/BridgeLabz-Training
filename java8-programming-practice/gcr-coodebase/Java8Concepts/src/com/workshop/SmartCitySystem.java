package com.workshop;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class SmartCitySystem {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService("A-B", 20, LocalTime.of(9, 0)),
                new MetroService("A-C", 30, LocalTime.of(8, 30)),
                new TaxiService("B-D", 100, LocalTime.of(9, 15)),
                new BusService("A-B", 25, LocalTime.of(10, 0)),
                new AmbulanceService()
        );

        // Lambda – Filter & Sort (Earliest Departure)
        System.out.println("Filtered & Sorted by Fare:");
        services.stream()
                .filter(s -> s.getFare() > 0)
                .sorted((s1, s2) -> Double.compare(s1.getFare(), s2.getFare()))
                .forEach(TransportService::printServiceDetails);

        //Method Reference – Printing
        System.out.println("\nAll Active Services:");
        services.forEach(TransportService::printServiceDetails);

        // GroupingBy Route
        System.out.println("\nGrouped by Route:");
        Map<String, List<TransportService>> grouped =
                services.stream()
                        .collect(Collectors.groupingBy(TransportService::getRoute));
        grouped.forEach((route, list) ->
                System.out.println(route + " -> " + list.size()));

        // Partitioning Peak vs Non-Peak (Before 9 AM = Peak)
        System.out.println("\nPeak vs Non-Peak:");
        Map<Boolean, List<TransportService>> partitioned =
                services.stream()
                        .collect(Collectors.partitioningBy(
                                s -> s.getDepartureTime().isBefore(LocalTime.of(9,0))
                        ));
        partitioned.forEach((peak, list) ->
                System.out.println(peak ? "Peak" : "Non-Peak" + " -> " + list.size()));

        // Revenue Summary
        DoubleSummaryStatistics stats =
                services.stream()
                        .collect(Collectors.summarizingDouble(
                                TransportService::getFare));

        System.out.println("\nTotal Revenue: " + stats.getSum());
        System.out.println("Average Fare: " + stats.getAverage());

        //Functional Interface (Lambda)
        FareCalculator calculator =
                (baseFare, distance) -> baseFare + (distance * 5);

        double finalFare = calculator.calculateFare(50, 10);
        System.out.println("\nCalculated Fare: ₹" + finalFare);

        // Static Method Call
        double distance = GeoUtils.calculateDistance(12.9, 77.5, 13.0, 77.6);
        System.out.println("Distance: " + distance);

        // Marker Interface Detection
        System.out.println("\nEmergency Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(TransportService::printServiceDetails);
    }
}

