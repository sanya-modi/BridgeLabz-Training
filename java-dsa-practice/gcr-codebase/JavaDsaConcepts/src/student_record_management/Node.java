package student_record_management;

public class Node {
	
	int rollNumber;
	String name;
	int age;
	String grade;
	Node next;
	
	public Node(int rollNumber, String name, int age, String grade) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
	
	public static Node head;
	public static Node tail;
	
	public void addFirst() {
		Node newNode = new Node( rollNumber, name, age, grade);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode = head.next;
		head = newNode;
	}
	
	
	public void addLast() {
		Node newNode = new Node( rollNumber, name, age, grade);
		if(head == null) {
			head = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	public void addSpecific(int n) {
		Node newNode = new Node(rollNumber, name, age, grade);
		
		Node temp = head;
		int index = 1;
		
		while(index < n) {
			temp = temp.next;
			index++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public String search(int rollNum) {
		if(head == null) {
			return "There is no student";
		}
		
		Node temp = head;
		while(temp!=null) {
			if(temp.rollNumber == rollNum ) {
				return temp.name;
			}
		}
		
		return "No student found";
		
	}
	
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.println("Name : " + temp.name);
			System.out.println("Roll Number : " + temp.rollNumber);
			System.out.println("Age : " + temp.age);
			System.out.println("Grade : "  + grade);
			System.out.println();
		}
	}
	
	
	
}
