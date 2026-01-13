package trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

public class Roundabout {

    private Vehicle head = null;
    private Vehicle tail = null;

    private Queue<String> waitingQueue = new LinkedList<>();
    private final int MAX_QUEUE_SIZE = 5;

    // Add vehicle to waiting queue
    public void addToQueue(String vehicleNumber) {
        if (waitingQueue.size() == MAX_QUEUE_SIZE) {
            System.out.println("Queue Overflow! Waiting area is full.");
            return;
        }
        waitingQueue.add(vehicleNumber);
        System.out.println("Vehicle added to waiting queue: " + vehicleNumber);
    }

    // Move vehicle from queue to roundabout
    public void enterRoundabout() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue Underflow! No vehicles waiting.");
            return;
        }

        String vehicleNumber = waitingQueue.poll();
        Vehicle newVehicle = new Vehicle(vehicleNumber);

        if (head == null) {
            head = tail = newVehicle;
            tail.next = head; // circular link
        } else {
            tail.next = newVehicle;
            tail = newVehicle;
            tail.next = head;
        }

        System.out.println("Vehicle entered roundabout: " + vehicleNumber);
    }

    // Remove vehicle from roundabout
    public void exitRoundabout() {
        if (head == null) {
            System.out.println("No vehicles in roundabout.");
            return;
        }

        System.out.println("Vehicle exited: " + head.vehicleNumber);

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    // Display roundabout state
    public void displayRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        System.out.print("Roundabout Vehicles: ");
        Vehicle temp = head;

        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }
}