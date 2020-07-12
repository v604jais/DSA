
public class DoublyLinkedList {

	Node head;
	
	static class Node{
		
		Node next;
		Node prev;
		int data;
		Node(int d){
			this.data=d;
		}
	}
	
	
	public void append(int data_1) {
		
		Node new_node= new Node(data_1);
		
		Node last=head;
		
		if(head==null) {
			
			new_node.prev=null;
			head=new_node;
		}
		else {
			while(last.next!=null) {
				  last=last.next;
			}
			 last.next=new_node;
			 new_node.prev=last;
		}
		
		
		
	}
	
	public void printList(Node node) {
		
		Node last=null;
		//forward traversal;
		while (node!=null) {
		System.out.print(node.data+" ");
		last=node;
		node=node.next;
		}
		 System.out.println(); 
		 //reverse traversing
		 while (last!=null) {
			 System.out.print(last.data+" ");
			 last =last.prev;
		 }
	}
	
	public static void main(String[] args) {
		
         
		DoublyLinkedList dll = new DoublyLinkedList(); 

        // Insert 6. So linked list becomes 6->NULL 
        dll.append(6); 

        // Insert 7. So linked list becomes 6->7->NULL 
        dll.append(7); 

        // Insert 1. So linked list becomes 6->7->1->NULL 
        dll.append(1); 

        // Insert 4. So linked list becomes 6->7->1->4->NULL 
        dll.append(4); 

        System.out.println("Created DLL is: "); 
        dll.printList(dll.head); 
	}

}
