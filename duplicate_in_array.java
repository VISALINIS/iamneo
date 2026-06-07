// You are using Java
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        /*boolean flag = true;
        for(int i = 0 ; i<n ;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    flag = false;
                    break;
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        //System.out.println();
        if(flag){
        System.out.println("\nThe array does not contain duplicates.");
        }
        else{
          System.out.println("\nThe array contains duplicates.");  
        }*/
        
        //by using hashSet;
        boolean flag = false;
         for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(!set.add(num)){
               flag = true;
               break;
            }
        }
        if(flag){
             System.out.println("\nThe array contains duplicates.");  
        }
        else{
         System.out.println("\nThe array does not contain duplicates.");
    }
    }
}