Single File Programming Question
Problem Statement



An astrologer gives a matrix to devilliers and tells him to add a largest row sum and largest column sum of the given matrix.The number which appears as a result is his lucky number for the final match jersey.



Write a program that adds up the largest row sum and the largest column sum from an N- rows*M-columns array of numbers to help devilliers for finding his lucky number for the final match jersey.



As a preliminary phrase , you should reformat the sequence of numbers as a matrix, whose number of rows and columns are to be specified as arguments.



Example1:

Input1 = 2

Input2 = 2

Input3 = {1,2,5,6}

 

Output: 19

Explanation:

Largest row(5,6) + Largest (2,6) =11+8 =19



Example 2:

Input1:4

Input2: 4

Input3: {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4}



Output: 26



Explanation:

The array has 4 rows (input1) and 4 columns (input2). The largest sum among the four columns is 10 and the largest sum among the four rows is 16. We get the final sum of 26 (10+16).

Input format :
The first line consists of an integer for row dimension of the array as R.

The second line consists of an integer for column dimension of the array as C.

The next R lines consists of the integers, representing the matrix elements.

Output format :
The output displays the largest sum and the largest column sum from an N-rows*M-columns array of numbers.



Refer to the sample output for the formatting specifications.

Code constraints :
1 <= R, C <= 10

1 <= matrix_elements <= 100

Sample test cases :
Input 1 :
2
2
1 2
5 6
Output 1 :
19
Input 2 :
4
4
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
Output 2 :
26
Note :
The program will be evaluated only after the “Submit Code” is clicked.
Extra spaces and new line characters in the program output will result in the failure of the test case.


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
        int r_largest = 0;
        int c_largest = 0;
        int max_c = 0;
        int max_r = 0;
         for(int i = 0;i<m;i++){
              r_largest = 0;
            for(int j = 0;j<n;j++){
                r_largest += arr[i][j];
            }
                max_r = Math.max(max_r,r_largest);
         }
         
       
         for(int j = 0;j<n;j++){
              c_largest = 0;
            for(int i = 0;i<m;i++){
                c_largest += arr[i][j];
            }
                max_c = Math.max(max_c,c_largest);
         }
         int ans = max_c+max_r;
         
         System.out.print(ans);
    }
}

// brute-tc-o(m*n),sc = o(m*n)


        
