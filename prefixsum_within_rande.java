Arjun, a financial analyst at an investment firm in Mumbai, needs to quickly calculate the sum of stock values over specific date ranges. Given an array of daily stock prices, he wants to efficiently compute the sum of elements between two given indices (inclusive) using the prefix sum technique. 



Help Arjun to implement a program that reads an array of integers, builds a prefix sum array, and then answers a range sum query.

Input format :
The first line of input consists of an integer n representing the number of elements in the array.

The second line consists of n integers separated by spaces representing the array elements.

The third line consists of two integers l and r separated by a space representing the range indices (1-based indexing).

Output format :
The output prints a single integer representing the sum of array elements from index l to index r (inclusive).



Refer to the sample output for the formatting specifications.

Code constraints :
The given testcases fall under the following constraints:

1 ≤ n ≤ 50

-1000 ≤ arr[i] ≤ 1000

1 ≤ l ≤ r ≤ n

Sample test cases :
Input 1 :
5
1 2 3 4 5
1 3
Output 1 :
6
Input 2 :
4
-1 -2 -3 -4
2 4
Output 2 :
-9
Input 3 :
6
10 20 30 40 50 60
3 6



// You are using Java
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
         int l = sc.nextInt();
         int r = sc.nextInt();
          int[] prefix = new int[n];
          int temp = 0;
          for(int i =0;i<n;i++){
               temp += arr[i];
              prefix[i]=temp;
          }
          l--;
          r--;
          int sum = 0;
          if(l==0){
              System.out.print(r);
          }
          else{
          res=prefix[r]-prefix[l-1];
          }
          System.out.print(res);
          
          /*int sum = 0;
          for(int i = 0;i<n;i++){
              if(i>=l && i<=r){
                sum+=arr[i]; 
              }
          }
          System.out.print(sum);*/
         
    }
}
