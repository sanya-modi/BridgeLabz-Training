package parceltracker;

class ParcelRoute {

    private Stage head;

    // Add stage at end
    void addStage(String stageName) {
        Stage newStage = new Stage(stageName);

        if (head == null) {
            head = newStage;
            return;
        }

        Stage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
    }

    // Add custom checkpoint after a stage
    void addCheckpoint(String afterStage, String checkpoint) {
        Stage temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(afterStage)) {
                Stage newStage = new Stage(checkpoint);
                newStage.next = temp.next;
                temp.next = newStage;
                System.out.println(" Checkpoint added: " + checkpoint);
                return;
            }
            temp = temp.next;
        }
        System.out.println(" Stage not found");
    }

    // Track parcel forward
    void trackParcel() {
        if (head == null) {
            System.out.println("No tracking data available.");
            return;
        }

        Stage temp = head;
        System.out.println("\n Parcel Tracking:");

        while (temp != null) {
            System.out.println("-> " + temp.name);

            // Lost parcel condition
            if (temp.next == null && !temp.name.equalsIgnoreCase("Delivered")) {
                System.out.println(" Parcel LOST / MISSING!");
                return;
            }
            temp = temp.next;
        }
        System.out.println(" Parcel Delivered Successfully!");
    }
}