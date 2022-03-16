package DoublyEndedQueue;

public class MyDeque<E> {
	
	Node<E> tail, head;
	
	 public E addFirst(E data) {
		 Node<E> toAdd = new Node<>(data);
		 
		 if(head == null) {
			 head = tail = toAdd;
			 return toAdd.data;
		 }
		 head.prev = toAdd;
		 toAdd.next = head;
		 head = toAdd;
		 
		 return toAdd.data;
	 }
	 
	 public E removeFirst() {
		 
		 if(head == null) {
			 return null;
		 }
		 Node<E> toRemove = head;
		 head = head.next;
		 head.prev = null;
		
		 if(head == null) {
				tail = null;
			 }
		 
		 return toRemove.data;
	 }
	 
	 
	 
	 public E addLast(E data) {
		 Node<E> toAdd = new Node<>(data);
		 
		 if(tail == null) {
			 tail = head = toAdd;
			 return toAdd.data;
		 }
		 tail.next = toAdd;
		 toAdd.prev = tail;
		 tail = toAdd;
		 
		 return toAdd.data;
		 }
	 
	
	 public E removeLast() {
		 
		 if(tail == null) {
			 return null;
		 }
		 Node<E> toRemove = tail;
		 tail = tail.prev;
		 tail.next = null;
		 
		 if(head == null) {
			tail = null;
		 }
		 return toRemove.data;
	 }
	 
	 public E peekFirst() {
		 if(head == null) {
			 return null;
		 }
		 return head.data;
	 }
	 
	 public E peekLast() {
		 if(tail == null) {
			 return null;
		 }
		 return tail.data;
	 }
	
	
	public static class Node<E>{
		
		E data;
		Node<E> next, prev;
		
		public Node(E data) {
			this.data = data;
			next = prev = null;
		}
	}

	public static void main(String[] args) {
		
		MyDeque md = new MyDeque();
		
		md.addFirst(12);
		System.out.println(md.peekFirst());
		md.addFirst(121);
		md.addLast(44);
		md.addFirst(13);
		md.addLast(88);
		
		System.out.println(md.peekFirst());
		System.out.println(md.peekLast());
	
		System.out.println(md.removeFirst());
		System.out.println(md.removeLast());
		System.out.println(md.removeLast());
		System.out.println(md.removeFirst());

	}

}
