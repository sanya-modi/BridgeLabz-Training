package parceltracker;

public class Main {

    public static void main(String[] args) {

        ParcelRoute route = new ParcelRoute(); 

        // Initial stages
        route.addStage("Packed");
        route.addStage("Shipped");
        route.addStage("In Transit");
        route.addStage("Delivered");

        // Add custom checkpoint
        route.addCheckpoint("Shipped", "At Warehouse");

        // Track parcel
        route.trackParcel();
    }
}
