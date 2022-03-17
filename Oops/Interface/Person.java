package Oops.Interface;

public class Person implements Student, YouTuber {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.study();
		p.makeVideos();
		
		YouTuber me = p;
		Student meh = p;
		
		p.learnCoding();
		me.VideoEdit();

	}

	@Override
	public void study() {
		System.out.println("person studies.");
		
	}

	@Override
	public void makeVideos() {
		System.out.println("person makes videos.");
		
	}


}
