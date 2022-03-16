package ArrayList;

import java.util.*;

public class HackerRankArrayListQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList[] arraylist = new ArrayList[20000];
        
        for(int i = 0; i < n; i++){
            arraylist[i] = new ArrayList();
            int m = sc.nextInt();
            for(int j = 0; j<m; j++){
                int o = sc.nextInt();
                arraylist[i].add(o);
                
            }
        }
        int q = sc.nextInt();
        for(int i = 0; i<q; i++){
            try{
                
            int a = sc.nextInt();
            int b = sc.nextInt();
        
            System.out.println(arraylist[a-1].get(b-1));
        }catch(Exception e){
            System.out.println("ERROR!");
        }
    }
}
}