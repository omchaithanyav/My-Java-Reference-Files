package LinkedList;

public class RunMyLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> MyLL1 = new MyLinkedList<>();
		MyLinkedList<String> MyLL2 = new MyLinkedList<>();
		
		
		
		for(int i =0; i<4; i++) {
			
			MyLL1.add(i);
			MyLL2.add(i + "Hey");
			
			}
		
		System.out.println(MyLL1.isEmpty());
		System.out.println(MyLL2.isEmpty());
		
		MyLL1.AddAtHead(12);
		MyLL2.AddAtHead("omi");
		
		
		MyLL1.addAtTail(122);
		MyLL2.addAtTail("SARA");
		
		MyLL1.addAtGivenPosition(5, 1211);
		MyLL2.addAtGivenPosition(1, "BabyDoll");
	
		MyLL2.DeleteNode(4);
		MyLL1.DeleteNode(3);
		
		MyLL1.print();
		System.out.println();
		MyLL2.print();

	
	}
}
