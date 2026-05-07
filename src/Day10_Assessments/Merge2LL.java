package Day10_Assessments;
import java.util.*;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class Merge2LL {
	
	public static Node mergeLists(Node l1, Node l2) {
		ArrayList<Integer> li = new ArrayList<>();
		
		Node dummy = new Node(0);
		Node current = dummy;
		
		while(l1 != null) {
			if(!li.contains(l1.data)) {	
				li.add(l1.data);
				current.next = new Node(l1.data);
				current = current.next;
			}
			l1 = l1.next;
		}
		
		while(l2 != null) {
			if(!li.contains(l2.data)) {
				li.add(l2.data);
				current.next = new Node(l2.data);
				current = current.next;
			}
			l2 = l2.next;
		}
		
		return dummy.next;
		
	}
	
	public static void printList(Node head) {
		while(head != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		
		System.out.println("NUll");
	}

	public static void main(String[] args) {
		//l1
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(3);

        //l2
        Node l2 = new Node(4);
        l2.next = new Node(5);
        l2.next.next = new Node(5);

        Node result = mergeLists(l1, l2);

        System.out.print("Merged List: ");
        printList(result);

	}

}
