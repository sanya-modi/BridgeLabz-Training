package bag_ball_organizer;

class Ball implements Storable {

    private String id;
    private String color;
    private String size; // small / medium / large

    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("Ball ID: " + id +
                ", Color: " + color +
                ", Size: " + size);
    }
}

