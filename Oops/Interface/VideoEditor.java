package Oops.Interface;

public interface VideoEditor {
	
	default void VideoEdit() {
		System.out.println("editing videos");
	}

}
