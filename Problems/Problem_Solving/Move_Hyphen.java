package Problems.Problem_Solving;

public class Move_Hyphen {
	public static String MoveHyphen_to_front(String str, int len) {
		String s = "";
		for(int i=0;i<len;i++) {
			if(str.charAt(i)=='-') {
				s = str.charAt(i)+s;
			}else {
				s = s+str.charAt(i);
			}
		}
		return s;
	}
	
	public static String MoveHyphen_to_last(String str, int len) {
		String s = "";
		int count = 0;
		for(int i=0;i<len;i++) {
			if(str.charAt(i)=='-') {
				count++;
				s = s+"";
			}else {
				s = s+str.charAt(i);
			}
		}
		for(int i=0;i<count;i++) {
			s = s+'-';
		}
		return s;
	}
	
	
	public static void main(String[] args) {
		String str = "Move-Hyphens-to-Front";
		String str1 = "String-Compare";
		
		System.out.println(MoveHyphen_to_front(str, str.length()));
		System.out.println(MoveHyphen_to_last(str1, str1.length()));
	}

}
