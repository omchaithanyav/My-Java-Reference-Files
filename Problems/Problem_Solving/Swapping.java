package Problems.Problem_Solving;

public class Swapping {

	public static void main(String[] args) {
		// Swapping without using 3rd variable
		
		int a = 9;
		int b = 7;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping a: "+a+", b: "+b );
		
		// swapping of two strings
		
		String str1 = "omi";
		String str2 = "sara";
		
		String temp = str1;
		str1 = str2;
		str2 = temp;
		
		System.out.println("str1: "+str1+", str2: "+str2);
		
		// swapping of two arrays
		
		int arr1[] = {3,4,55,91,29,39,77,1099};
		int arr2[] = {21, 32, 11, 9};
		
		int tempo[] = arr1;
		arr1 = arr2;
		arr2 = tempo;
		
		System.out.println("arr1: "+arr1[3]+", arr2: "+arr2[3]);

	}

}
