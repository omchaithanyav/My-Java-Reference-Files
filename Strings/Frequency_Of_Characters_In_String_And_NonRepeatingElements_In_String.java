package Strings;

import java.util.Scanner;

public class Frequency_Of_Characters_In_String_And_NonRepeatingElements_In_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char s[] = str.toCharArray();
		int visit[] = new int[s.length];
		int visited = -1;
		
		for(int i=0;i<s.length;i++) {
			int count = 1;
			for(int j=i+1;j<s.length;j++) {
				if(s[i]==s[j] && i!=j) {
					count++;
					visit[j] = visited;
				}
			}
			if(visit[i] != visited) {
				visit[i] = count;
			}
		}
		for(int i=0;i<s.length;i++) {
			if(visit[i] != -1) {
				System.out.println("Frequency of "+s[i]+" is: "+visit[i]);
			}
		}
		System.out.println("Non - Repeated characters are: ");
		for(int i=0;i<s.length;i++) {
			if(visit[i] == 1) {
				System.out.println(s[i]);
			}
		}
	}

}
