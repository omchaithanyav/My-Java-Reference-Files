package Problems.Problem_Solving;

public class Number_Of_Carries {
	public static int NumberOfCarries(int a, int b) {
		int temp1 = a;
		int temp2 = b;
		
		int count = 0;
		int carry = 0;
		
		while(temp1!=0 && temp2!=0) {
			int last_digit1 = temp1%10;
			int last_digit2 = temp2%10;
			
			if((last_digit2+last_digit1+carry) > 9) {
				count++;
				int sum = last_digit1 + last_digit2 + carry;
				carry = sum/10;
			}
			temp1 = temp1/10;
			temp2 = temp2/10;
			
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(NumberOfCarries(1324, 1978));

	}

}
