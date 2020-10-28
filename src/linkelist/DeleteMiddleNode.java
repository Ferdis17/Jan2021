package linkelist;

public class DeleteMiddleNode {

	 public static void displayElements(Node head){
	        while ( head != null) {
	            System.out.println(head.value + " ");
	            head = head.next;
	        }
	    }

	    public static void main(String[] args) {
	        Node start = new Node(12);
	        start.next = new Node(12);
	        start.next.next = new Node(11);
	        start.next.next.next = new Node(23);
	        start.next.next.next.next = new Node(12);
	        start.next.next.next.next.next = new Node(11);
	        start.next.next.next.next.next.next = new Node(10);

	        System.out.println("Linked list before removing duplicates : ");
	        displayElements(start);

	        deleteMiddleNode(start);

	        System.out.println("Linked list after removing duplicates : ");
	        displayElements(start);
	    }

	public static Node deleteMiddleNode( Node d) {
		 if(d == null || d.next == null) {
			 
			 return null;
		 }
		 Node next = d.next;
		 d.value = next.value;
		 d.next = next.next;
		
		return next;
	}
	
	 static class Node{
	        int value;
	        Node next;
	        public Node(int value){
	            this.value = value;
	        }
	    }

}
