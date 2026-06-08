// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        } 
   
        if(n<m){
            System.out.print("The matrix is not symmetric.");
        }
       boolean symmetric = true;
       for(int i= 0 ;i<m;i++){
            for(int j = 0;j<n;j++){
                if(arr[j][i] != arr[i][j]){
                    symmetric = false;
                    break;
                }
            }
       }
       if(symmetric){
           System.out.print("The matrix is symmetric.");
       }
       else{
           System.out.print("The matrix is not symmetric.");  
       }
        
    }
}
