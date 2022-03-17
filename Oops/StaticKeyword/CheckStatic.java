package Oops.StaticKeyword;

import Oops.StaticKeyword.A.B;
import Oops.StaticKeyword.A.D;

public class CheckStatic {

	public static void main(String[] args) {
		
		A objA = new A();
		B objB = objA.new B();
		D objD = new A.D();
		
	}

}
