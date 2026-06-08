import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
          boolean sort  = true;
        for(int i = 0;i<m-1;i++){
            for(int j = 0;j<n;j++){
                if(arr[i][j] > arr[i+1][j]){
                sort = false;
            }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n-1;j++){
                if(arr[i][j] > arr[i][j+1]){;
                sort = false;
                }
            }
        }
        if(sort){
            System.out.print("Each row and each column is sorted in ascending order.");
        }
        else{
            System.out.print("The matrix is not sorted.");
        }
        
          
        
        
    }
}