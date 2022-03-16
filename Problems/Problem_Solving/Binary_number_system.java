package Problems.Problem_Solving;

public class Binary_number_system {
	
	public static int OperationsBinaryString(String str) {
		int r = str.charAt(0) - '0';
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)=='A') {
				r = r & str.charAt(i+1) - '0';
				
			}else if(str.charAt(i)=='B') {
				r = r | str.charAt(i+1) - '0';
			}else if(str.charAt(i)=='C') {
				r = r ^ str.charAt(i+1) - '0';
			}
		}
		return r; // here we r subtracting r with the ascii value of '0'. So, if r is 0 we get 0 (48-48 = 0). If r is 1 we get 1 (49 - 48 = 1). 
	}
	

	public static void main(String[] args) {
		String s = "1C0C1C1A0B1";
		System.out.println(OperationsBinaryString(s));
		
	}

}
