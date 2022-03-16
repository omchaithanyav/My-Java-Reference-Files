package Arrays;

public class ArrayDeclaration {

	public static void main(String[] args) {
		
		int age[] = new int[12];
		
		int[] roomNumber = new int[10];
		
		int marks[], rollNumber[] = new int[17];
		
		double array[] = {1.2, 2.1, 2.2};

	     System.out.println(array[2]);
	     
	     array[1] = 0.90;
	     
	     System.out.println(array[1]);
	
	     for(int i =0; i < array.length; i++) {
	    	 System.out.println(array[i]);
	     }

	}

}
