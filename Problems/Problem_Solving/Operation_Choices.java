package Problems.Problem_Solving;

public class Operation_Choices {
	public static int OperationChoices(int a, int b, int c) {
		int res = 0;
		
		switch(c) {
		case 1:
			res = a+b;
			break;
			
		case 2:
			res = a-b;
			break;
		
		case 3:
			res = a*b;
			break;
			
		case 4:
			res = a/b;
			break;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(OperationChoices(16,20,2));

	}

}
