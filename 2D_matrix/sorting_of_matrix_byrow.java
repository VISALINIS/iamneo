/*Given an n × n square matrix, sort it in strict order: after sorting, every row is in increasing order from left to right, and for each row i (1 ≤ i ≤ n−1) the first element is greater than or equal to the last element of row i−1. Equivalently, the smallest n² values fill the matrix row by row in ascending order.
Examples:
Input 1:

3

5 4 7

1 3 8

2 9 6

Output 1: 

1 2 3 

4 5 6 

7 8 9 



Input 2: 

4

4 1 2 5

7 8 3 6

9 10 16 13

12 11 14 15

Output 2: 

1 2 3 4 

5 6 7 8 

9 10 11 12 

13 14 15 16

Input format :
The first line contains an integer n — the number of rows and columns.

The next n lines each contain n space-separated integers.

Output format :
Print the sorted matrix, one row per line, elements separated by spaces*/

// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp[] = new int[n*n];
        int k =0;
        int[][] arr = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
                temp[k++] = arr[i][j];
            }
        }
        k =0;
        Arrays.sort(temp);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                 arr[i][j] = temp[k++];
            }
        }
        
            
         for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                 System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
