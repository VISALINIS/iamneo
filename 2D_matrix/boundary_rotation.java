// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0;i<n ;i++){
            for(int j=0 ;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = n-1; 
         
        while(top<bottom && left<right){
            int temp = arr[top][left];
            
            //left
            for(int i = top;i<bottom;i++){
                arr[i][left] = arr[i+1][left];
            }
            //bottom
            for(int j = left;j<right;j++){
                arr[bottom][j] = arr[bottom][j+1];
            }
            //right
            for(int i = bottom;i>top;i--){
                arr[i][right] = arr[i-1][right];
            }
            // top
            for(int j = right;j>left;j--){
                arr[top][j] =  arr[top][j-1];
            }
        
            arr[top][left+1] = temp;
      
            top++;
            left++;
            right--;
            bottom--;
            }
          for(int i = 0;i<n ;i++){
            for(int j=0 ;j<n;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
          }
        

        
    }
}
