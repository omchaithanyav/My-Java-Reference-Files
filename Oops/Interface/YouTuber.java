package Oops.Interface;

public abstract interface YouTuber extends VideoEditor {

	     default void makeVideos() {
		System.out.println("Making videos");
	}
	

}
