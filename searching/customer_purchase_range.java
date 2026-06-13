/*Customer Purchase Range
An online store maintains customer purchase records sorted by product ID. Given a product ID, determine the first purchase position and last purchase position where that product appears in the records. If the product does not exist, print -1 -1.

Input format :
First line contains an integer N representing the number of purchase records.
Second line contains N space-separated integers representing product IDs.
Third line contains an integer P representing the product ID to search.
Output format :
Print two integers:

firstPosition lastPosition
If the product does not exist:

-1 -1

Code constraints :
1 ≤ N ≤ 10000
1 ≤ Product ID ≤ 100000
Purchase records are sorted in ascending order.
Sample test cases :
Input 1 :
8
101 101 101 102 103 103 104 105
101
Output 1 :
0 2
Input 2 :
7
10 20 30 40 50 60 70
25
Output 2 :
-1 -1*/

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int start = -1;
        int end = -1;
        
        for(int i =0;i<n;i++){
            if(arr[i]==target){
                if(start ==-1){
                    start = i;
                }
                end = i;
            }
        }
        System.out.println(start+" "+end);
        
    }
}
