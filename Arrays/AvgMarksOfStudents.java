package Arrays;
import java.util.Scanner;

public class AvgMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		
		int sum = 0;
		
		System.out.println("Enter the marks here: ");
		
		for(int i = 0; i < n; i++) {
			
			marks[i] = sc.nextInt();
		    
			sum = sum + marks[i];
		
		}

	        System.out.println("The Average marks is: " + sum/n);
	}
	

}
