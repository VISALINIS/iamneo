// You are using Java
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int temp = 0;
        int[] res = new int[n];
        int k = 0;
        for(int i =n-1;i>=0;i--){
            res[k++] = arr[i]; 
        }
         for(int i = 0;i<n;i++){
             System.out.print(arr[i]);
         }
        if(Arrays.equals(arr,res)){
            System.out.print("\nThe array is palindrome.");
        }
        else{
            System.out.print("\nThe array is not a palindrome.");
        }
        
        
        
    }
}
