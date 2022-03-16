package Arrays;

public class Duplicate_in_an_Array_Integers {   // find duplicate in an array of N+1 Integers

	public static void main(String[] args) {
		int a[] = {4,3,2,1,3};
        int arr[] = new int[a.length]; 
        
        for(int i=0;i<a.length;i++){
            arr[a[i]]++;
            if(arr[a[i]]>1){
                System.out.print("Duplicate: "+a[i]);
                break;
            }
        }
	}
}
