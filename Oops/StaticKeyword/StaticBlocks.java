package Oops.StaticKeyword;

public class StaticBlocks {
	
	
	static {
		
		System.out.println("This is static Block 1");
	}
	
	static {
		
		System.out.println("This is static Block 2");
	}

	public static void main(String[] args) {
		
		System.out.println("This is main function execution");  // main function will be executed after all the static blocks.

	}
	
	static {
		
		System.out.println("This is static Block 3");
	}

}