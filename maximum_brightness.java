/*
In the city of Luthonia, street lamps line up along the main avenue. Each lamp emits or absorbs light based on a character in a string. Each character has a brightness value:

Lowercase letters are positive: a = +1, b = +2, …, z = +26
Uppercase letters are negative: A = −1, B = −2, …, Z = −26


Researchers want to find the brightest contiguous segment — the substring whose total brightness (sum of its characters' values) is the maximum possible.



Your program must compute and print:

The maximum brightness.
The substring that produces this maximum brightness.


Tie-breaking rule: If more than one substring produces the maximum brightness, print the one that ends at the earliest position in the string. If more than one such substring ends at that same position, print the longest one.

Input format :
A single line containing a string s consisting only of uppercase and/or lowercase English letters.

Output format :
The first line prints an integer: the maximum brightness.

The second line prints the substring that gives this maximum brightness.



Refer to the sample output for formatting specifications.

Code constraints :
The given testcases fall under the following constraints:

1 ≤ |s| ≤ 10⁴

The string contains only English letters (a–z, A–Z).

It is guaranteed that at least one character has a positive brightness value.

Sample test cases :
Input 1 :
klm
Output 1 :
36
klm
Input 2 :
vvv
Output 2 :
66
vvv
Note :
The program will be evaluated only after the “Submit Code” is clicked.
Extra spaces and new line characters in the program output will result in the failure of the test case.*/
// You are using Java
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int max = Integer.MIN_VALUE;
        String ans ="";
        
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n+1;j++){
                int res =0;
                String sub = str.substring(i,j);
                for(int k = 0;k<sub.length();k++){
                   
                    char ch = sub.charAt(k);
                    if(Character.isLowerCase(ch)){
                        res+=ch-'a'+1;
                    }
                    else if(Character.isUpperCase(ch)){
                        res-=(ch-'A'+1);
                    }
                    }
                    if(res>max){
                        max = res;
                        ans = sub;
                    }
            }
        }
                
            
        
            
                System.out.println(max);
                System.out.print(ans);
            }
        }
    

