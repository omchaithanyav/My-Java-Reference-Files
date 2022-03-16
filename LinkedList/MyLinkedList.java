package LinkedList;

public class MyLinkedList<E>{ 
	
	 Node<E> head;
	
	public void add(E data) {
		
		Node<E> toAdd = new Node<E>(data);
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
		temp = temp.next;   
		
		}
		
		temp.next = toAdd;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
		System.out.print(temp.data + " ");	
		temp = temp.next;
		
	}
}
	
	void AddAtHead(E data) {
		
		Node<E> ToAddAtHead = new <E>Node<E>(data); 
		ToAddAtHead.next = head;
		head = ToAddAtHead;
		
	}
	
	void DeleteNode(int position) {
		Node<E> temp = head;
		
		if(head == null) return;
		
		if(position == 0) head = head.next;
		
		int count = 1;
		while(temp.next != null) {
			if(position == count) {
				temp.next = temp.next.next;
				break;
			}
			temp = temp.next;
			count++;
			
		}
	}
	
	 void addAtTail(E data) {
		
		Node<E> addAtEnd = new <E>Node<E>(data);
		Node<E> temp = head;
		
		while(temp.next != null) {
			
			temp = temp.next;
		}
		temp.next = addAtEnd;
		
	}
	 
	 void addAtGivenPosition(int pos, E data) {
		 
		 Node<E> addAtPos = new <E>Node<E>(data);
		 
		 if(pos == 0) {
			 addAtPos.next = head;
			 head = addAtPos;
		 }
		 
		 Node<E> temp = head;
		 int count = 1;
		 
		 while(temp != null && count < pos) {
			 
			 temp = temp.next;
			 count++;
		 }
		 
		 addAtPos.next = temp.next;
		 temp.next = addAtPos;
	 }
	 
	 public E deleteLastNode() throws Exception {
		 Node<E> temp = head;
		 
		 if(temp == null) {
			 throw new Exception("No elements found");
		 }
		 
		 if(temp.next == null) {
			 Node<E> toRemove = head;
			 head = null;
		 }
		 
		 while(temp.next.next != null) {
			 temp = temp.next;
		 }
		 Node<E> toRemove = temp.next;
		 temp.next = null;
		 return toRemove.data;
	 }
	 
	 public E getLast() throws Exception{
		 Node<E> temp = head;
		 
		 if(temp == null) {
			 throw new Exception("Stack is Empty");
		 }
		 
		 while(temp.next != null) {
			 temp = temp.next;
		 }
		 
		 return temp.data;
	 }

	public static class Node<E> {
		public E data;
		public Node next; 
		
		public Node(E data){
			this.data = data;
			next = null;
			
		}
	}

}
