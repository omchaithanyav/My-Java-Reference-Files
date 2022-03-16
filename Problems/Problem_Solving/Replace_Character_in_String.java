package Problems.Problem_Solving;

public class Replace_Character_in_String {
	public static String ReplaceCharacter(String str, int n, char ch1, char ch2) {
		String s = "";
		for(int i=0;i<n;i++) {
			if(str.charAt(i)==ch1) {
				s = s+ch2;
			}else if(str.charAt(i)==ch2) {
				s = s+ch1;
			}else {
				s = s+str.charAt(i);
			}
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(ReplaceCharacter("apples", "apples".length(), 'p', 'a'));

	}
}
