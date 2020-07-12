
public class LinkedList {
    
	Node head;
	
    static class Node{
    	
    	int data;
    	Node next;
    	Node(int d){
    		this.data=d;
    		this.next=null;
    	}
    }	
	
    public static LinkedList insert(LinkedList list, int data) {
    	
    	Node new_Node= new Node(data);
    	//new_Node.Next=null;
    	if(list.head==null) {
    		list.head=new_Node;
    	}else {
        Node last=list.head;//current add
    	while (last.next!=null) {
    		     last=last.next;
    	 }
    	last.next=new_Node;
      }
    	return list;
    }
    
    
  public static void printList(LinkedList list) {
    	
    	Node currNode= list.head;
    	
    	while (currNode != null) {
    		System.out.print(currNode.data+" ");
    		
    		currNode=currNode.next;
    	}
   }
    
	public static void main(String[] args) {
		
       LinkedList list= new LinkedList();
       
       list=LinkedList.insert(list, 10);
       list=LinkedList.insert(list, 2);
       list=LinkedList.insert(list, 1);
       list=LinkedList.insert(list, 3);
       
       LinkedList.printList(list);
       
	}

}
