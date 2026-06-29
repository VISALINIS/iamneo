Single File Programming Question
Problem Statement



Jack and Jill are playing a string game. Jack has given Jill two strings A and B. Jill has to derive a string C from A, by deleting elements from string A, such that string C does not contain any element of string B. Jill needs help to do this task. She wants a program to do this as she is lazy. Given strings A and B as input, give string C as Output.



Example:

Input:

tiger ->Input string A

ti ->Input string B

output:

ger ->output string C

Explanation:

After removing “t” and “I” from “tiger”. We are left with “ger”. So the answer is “ger”.

Input format :
The first line consists of the string, representing the string A.

The second line consists of the string, representing the string B.

Output format :
The output displays a string C, which is the result of the string B taken out from A as per the logic.



Refer to the sample output for the formatting specifications.

Code constraints :
0 < length of A < 100

0 < length of B < length of A

A and B contains only lowercase letters

Sample test cases :
Input 1 :
tiger
ti
Output 1 :
ger
Note :
The program will be evaluated only after the “Submit Code” is clicked.
Extra spaces and new line characters in the program output will result in the failure of the test case.


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String ans = "";
        
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(s2.indexOf(ch)==-1){
                ans +=ch;
            }
        }
        System.out.print(ans);
        }
}

/*
Time Complexity: O(n × m)
Space Complexity: O(n)*/
