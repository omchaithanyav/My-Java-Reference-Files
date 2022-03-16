package Arrays;

public class Longest_Palindrome_in_array {
	public static boolean isPalindrome(int num) {
		int sum = 0;
		int temp = num;
		boolean palindrome = false;
		
		while(temp != 0) {
			int last_digit=temp%10;
			sum = sum*10 + last_digit;
			temp = temp/10;
		}
		if(sum==num) {
			palindrome = true;
		}
		return palindrome;
		
	}
	public static void main(String[] args) {
		int a[] = {12123, 111, 231, 3223, 2, 11, 9};
		// sorting the array:
		for(int i = 1; i < a.length; i++) {
			
			int temp = a[i];
			int j = i-1;
			
			while(j >= 0 && a[j] > temp) {
				
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
		
		// finding the largest palindrome:
		for(int i=a.length-1;i>=0;i--) {
			if(isPalindrome(a[i])==true) {
				System.out.println(a[i]+" is the largest palindrome.");
				break;
			}
		}
		
	}

}
