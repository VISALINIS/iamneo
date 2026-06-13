Logistics Hub Shipment Locator



A logistics company maintains shipment records in ascending order of shipment IDs. Due to a system migration, the records were shifted at an unknown point while preserving their relative ordering. When a customer requests a shipment status, the system must quickly determine the position of a specific shipment ID in the current record sequence.



Given the current shipment record sequence and a target shipment ID, find the position (0-based index) of the shipment. If the shipment does not exist, return -1.



Input format :
First line contains an integer N, representing the number of shipment records.
Second line contains N space-separated integers representing shipment IDs after system migration.
Third line contains an integer T, representing the shipment ID to be searched.
Output format :
Print a single integer representing:

The position (0-based index) of the target shipment ID if found.
-1 if the shipment ID is not present.
Code constraints :
1 ≤ N ≤ 100000
-10^9 ≤ Shipment ID ≤ 10^9
All shipment IDs are unique.
The original shipment IDs were sorted in ascending order before migration.
The record sequence is shifted at most once.
Sample test cases :
Input 1 :
7
40 50 60 70 10 20 30
10
Output 1 :
4
Input 2 :
5
30 40 50 10 20
35
Output 2 :
-1

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int s = 0;
        int e=n-1;
        
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
                }
            if(arr[mid]>arr[e]){
                if(target>=arr[s] && target<arr[mid]){
                   e=mid-1;
                }
                else{
                    s=mid+1;
                }
                }
                else{
                    if(target>arr[mid] && target<=arr[e]){
                        s = mid+1;
                    }
                    else{
                        e = mid-1;
                    }
                }
        }
            
            System.out.println(-1);
        
    }
}
