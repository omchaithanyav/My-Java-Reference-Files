package Strings;

public class AnagramOfAString {

	public static void main(String[] args) {
		
		String a = "sileent";
		String b = "listen";
		boolean isAnagram = false;
		boolean visited[] = new boolean[b.length()]; 
		
		if(a.length() == b.length()) {
			
			for(int i = 0; i<a.length(); i++) {
		        isAnagram = false;
			    for(int j = 0; j < b.length(); j++) {
				    if(b.charAt(j) == a.charAt(i) && visited[j] == false) {
					   isAnagram = true;
					   visited[j] = true;
					   break;
				}
			}
			if(!isAnagram) {
				break;
			}
		}
		
		if(isAnagram == true) {
			System.out.println(a + " and " + b + " are Anagrams");
				
		}else {
			System.out.println(a+ " and "+ b + " are Not Anagrams");
		}

	}

}
}