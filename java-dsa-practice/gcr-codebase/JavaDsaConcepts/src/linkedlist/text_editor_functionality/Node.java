package linkedlist.text_editor_functionality;

public class Node {
	
	 String text;   // text content at this state
	    Node prev;     // previous state (undo)
	    Node next;     // next state (redo)

	    public Node(String text) {
	        this.text = text;
	        this.prev = null;
	        this.next = null;
	    }

}
