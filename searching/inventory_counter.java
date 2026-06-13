/*Inventory Item Counter
A warehouse management company receives a daily shipment containing item identifiers. Due to operational requirements, the manager needs to know how many times a specific item appears in the shipment record. Given a list of item identifiers and a target item identifier, determine the total number of occurrences of the target item in the shipment.

Input format :
First line contains an integer N representing the number of items in the shipment.
Second line contains N space-separated integers representing item identifiers.
Third line contains an integer T representing the target item identifier.
Output format :
Print a single integer representing the number of times the target item appears in the shipment.
Code constraints :
1 ≤ N ≤ 100000
-10^9 ≤ Item Identifier ≤ 10^9
-10^9 ≤ T ≤ 10^9
Sample test cases :
Input 1 :
5
1 2 3 2 4
2
Output 1 :
2
Input 2 :
6
10 10 10 20 30 40
10
Output 2 :
3*/

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
         for(int i = 0;i<n;i++){
             arr[i] = sc.nextInt();
         }
         int target = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
