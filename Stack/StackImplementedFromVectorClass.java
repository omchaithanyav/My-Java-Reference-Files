package Stack;

import java.util.Stack;

public class StackImplementedFromVectorClass {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push(12);
		stack.push(1);
		stack.push(233);
		stack.push(273);
		
		System.out.println(stack.peek());
		
		int popped = (int) stack.pop();
		
		System.out.println(popped);
		
		stack.pop();
		
		System.out.println(stack.peek());
		
		System.out.println(stack);

	}

}
