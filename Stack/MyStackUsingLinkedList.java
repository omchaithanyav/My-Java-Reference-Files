package Stack;

import LinkedList.MyLinkedList;

public class MyStackUsingLinkedList<E> {
	
 	private MyLinkedList<E> ll = new MyLinkedList<E>();
	
	
	void push(E e) {
		
		ll.add(e);
	}
	
	E pop() throws Exception {
		
		if (ll.isEmpty()) {
			throw new Exception("can't pop from empty stack");
		}
		
		return ll.deleteLastNode();
		
		
	}
	
	E peek() throws Exception{
		
		return ll.getLast();
	}

	public static void main(String[] args) throws Exception {
		
		MyStackUsingLinkedList stack1 = new MyStackUsingLinkedList();
		
		stack1.push(12);
		stack1.push(21);
		stack1.push(34);
		stack1.push(3441);
		stack1.push(2344);
		
		int peeked1 = (int)stack1.peek();
		
		stack1.pop();
		
		int pooped = (int) stack1.pop();
		
		int peeked = (int)stack1.peek();
		
		System.out.println(pooped+" "+peeked+" "+peeked1);
		
		
		

	}

}
