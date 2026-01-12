package callcenter;

import java.util.*;

public class CustomerQueue {
	
    // Normal queue
	private Customer head;
	private Customer tail;
	
	//Priority Queue
	private PriorityQueue<String> vipQueue = new PriorityQueue<>();

    // Call count
	private HashMap<String, Integer> callCount = new HashMap<>();
	
	public void add( String name, boolean isVIP) {

		callCount.put(name, callCount.getOrDefault(name, 0)+1);
		
		if (isVIP) {
            vipQueue.add(name);
            System.out.println(name + " added to VIP queue");
            return;
        }
		
		Customer newCustomer = new Customer( name);
		
		if(head == null) {
			head = tail = newCustomer;
			System.out.println(name + " added to normal queue");
			return;
		}
		
		tail.next = newCustomer;
		tail = newCustomer;
		System.out.println(name + " added to normal queue");
	}
	
	public void remove() {
		
		// VIP has priority
        if (!vipQueue.isEmpty()) {
            System.out.println("Serving VIP customer: " + vipQueue.poll());
            return;
        }
        
		if(head == null) {
			System.out.println("No Customer Present");
			return;
		}
		
		if(head == tail) {
			System.out.println("Serving Normal Customer: " + head.name );
			head = tail = null;
			return;
		}
		
		System.out.println("Serving Normal Customer: " + head.name );
		head = head.next;
		
	}
	
	 // Display normal queue
    public void displayNormalQueue() {
        if (head == null) {
            System.out.println("Normal Queue: empty");
            return;
        }

        Customer temp = head;
        System.out.print("Normal Queue: ");
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display VIP queue
    public void displayVIPQueue() {
        System.out.println("VIP Queue: " + vipQueue);
    }

    // Display call count
    public void displayCallCount() {
        System.out.println("Customer Call Count:");
        System.out.println(callCount);
    }

}
