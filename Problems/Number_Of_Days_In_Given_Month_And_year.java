package Problems;
import java.util.Scanner;
public class Number_Of_Days_In_Given_Month_And_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		if((month==2) && (year%4==0) || (year%100==0) && (year%400==0)){
			System.out.println("29 days");
		}
		else if(month==2) {
			System.out.println("28 days");
		}
		else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			System.out.println("31 days");
		}
		else {
			System.out.println("30 days");
		}

 }
}
