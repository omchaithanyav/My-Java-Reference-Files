package Oops.Generics;

public class GenericArray {

	public <X> void printArray(X[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		Integer [] intArray = {1, 2, 3};
        String [] stringArray = {"Hello", "World"};
        
        GenericArray a = new GenericArray();
        
        a.printArray(intArray);
        a.printArray(stringArray);
				
		}
}