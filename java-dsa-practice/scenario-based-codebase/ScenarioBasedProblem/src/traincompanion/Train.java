package traincompanion;

public class Train {
	
	  private Compartment head;
	    private Compartment tail;
	    private Compartment current;

	    // Add compartment at end
	    public void addCompartment(String name, String service) {
	        Compartment newComp = new Compartment(name, service);

	        if (head == null) {
	            head = tail = current = newComp;
	        } else {
	            tail.next = newComp;
	            newComp.prev = tail;
	            tail = newComp;
	        }
	        System.out.println("Compartment added: " + name);
	    }

	    // Move to next compartment
	    public void moveNext() {
	        if (current != null && current.next != null) {
	            current = current.next;
	            displayCurrent();
	        } else {
	            System.out.println("You are at the last compartment.");
	        }
	    }

	    // Move to previous compartment
	    public void movePrevious() {
	        if (current != null && current.prev != null) {
	            current = current.prev;
	            displayCurrent();
	        } else {
	            System.out.println("You are at the first compartment.");
	        }
	    }

	    // Display current + adjacent compartments
	    public void displayCurrent() {
	        System.out.println("\nCurrent Compartment: " + current.name +
	                " (" + current.service + ")");

	        System.out.println("Previous: " +
	                (current.prev != null ? current.prev.name : "None"));

	        System.out.println("Next: " +
	                (current.next != null ? current.next.name : "None"));
	    }

	    // Search service
	    public void searchService(String service) {
	        Compartment temp = head;

	        while (temp != null) {
	            if (temp.service.equalsIgnoreCase(service)) {
	                System.out.println("Service '" + service +
	                        "' found in compartment: " + temp.name);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Service not found.");
	    }

	    // Remove compartment by name
	    public void removeCompartment(String name) {
	        Compartment temp = head;

	        while (temp != null) {
	            if (temp.name.equalsIgnoreCase(name)) {

	                if (temp.prev != null)
	                    temp.prev.next = temp.next;
	                else
	                    head = temp.next;

	                if (temp.next != null)
	                    temp.next.prev = temp.prev;
	                else
	                    tail = temp.prev;

	                if (current == temp)
	                    current = head;

	                System.out.println("Compartment removed: " + name);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Compartment not found.");
	    }

}
