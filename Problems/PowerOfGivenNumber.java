package Problems;

public class PowerOfGivenNumber {
	public static int power(int a, int b) {
		
		if(b == 0) return 1;
		int result = 1;
		//for(int i=b; i>0; i--){
		while(b != 0) {
			result = a * result;
			b--;
		}
		return result;
	}
	
	public static int recursive_power(int a, int b) {
		if(b == 0) return 1;
		
		return a * recursive_power(a, b-1);
	}

	public static void main(String[] args) {

		System.out.println(power(7, 3));
		System.out.println(recursive_power(7, 3));

	}

}
