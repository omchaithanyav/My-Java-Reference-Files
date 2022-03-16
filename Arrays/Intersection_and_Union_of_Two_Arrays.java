package Arrays;

import java.util.HashSet;

public class Intersection_and_Union_of_Two_Arrays {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7,17};
		int b [] = {12,13,4,3,14,6,1};
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		// union
		System.out.print("Union: ");
		for(int i=0; i<a.length;i++) {
			hs1.add(a[i]);
			hs2.add(a[i]);
		}
		for(int i=0; i<b.length;i++) {
			hs1.add(b[i]);
		}
		System.out.println(hs1);
		
		// intersection
		System.out.print("Intersection: ");
		for(int i=0;i<b.length;i++) {
			if(hs2.contains(b[i])) {
				System.out.print(b[i]+" ");
			}
		}

	}

}
