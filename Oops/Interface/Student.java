package Oops.Interface;

public abstract interface Student  {
	
	
	void study();
	
	
	default void learnCoding() {
		System.out.println("Learning to Code");
	}
	

	
}
