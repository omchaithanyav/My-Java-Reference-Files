package Queue;

import LinkedList.MyLinkedList.Node;

public class MyQueue<E> {
	
	
	private Node<E> head, rear;
	
	public void enqueue(E e) {
		
		Node<E> toAdd = new Node<>(e);
		if(head == null) {
			head = rear = toAdd;
			return;
		}
		
		rear.next = toAdd;
		rear = rear.next;
		}
	
	public E dequeue() {
		
		if(head == null) {
			return null;
		}
		
		Node<E> temp = head;
		head = head.next;
		
		if(head == null) {
			rear = null;
		}
		return temp.data;
				
	}
	
	public E element() throws Exception {
		
		if(head == null) {
			throw new Exception("the queue is empty");
		}
		return (E)head.data;
	}

	public static void main(String[] args) throws Exception {
		
		MyQueue<Integer> q = new MyQueue<>();
		
		q.enqueue(34);
		q.enqueue(-3);
		q.enqueue(124);
		q.enqueue(902);
		
		System.out.println(q.dequeue());
		
		System.out.println(q.element());
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		System.out.println(q.element());
		
	
		
		
		
		
			
		



	}

}
