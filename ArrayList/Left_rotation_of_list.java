package ArrayList;
import java.util.*;
public class Left_rotation_of_list {
	
	public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> b=new ArrayList<Integer>();
        int len = a.size();
        for(int i=d;i<len;i++){
            b.add(a.get(i));
        }
        for(int i=0;i<d;i++){
            b.add(a.get(i));    
        }
        return b;
    }
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);
		
		System.out.println(rotLeft(list,3));
	}
}

