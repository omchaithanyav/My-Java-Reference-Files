package Problems;
import java.util.Scanner;
public class MaximumNumberOfHandshakes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num_of_persons = sc.nextInt();
		 
		 int result = (num_of_persons*(num_of_persons-1))/2;
		 
		 
		 System.out.println("The Maximum number of handshakes would be: "+ result);

	}

}
