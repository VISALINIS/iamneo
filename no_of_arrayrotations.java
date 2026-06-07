import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int minindex = 0;
        for(int i = 1;i<n;i++){
            if(arr[i]<arr[minindex]){
                minindex = i;
            }
        }
        System.out.printf("The number of rotations in the array is: %d",minindex);
    }
}
