/*Ashok is developing a text-processing utility that inserts a substring into an original string at a specified position. The program reads the original string, the substring to insert, and the index at which the substring should be inserted, then prints the resulting string.



The substring is inserted before the character currently at the given index. For example, inserting at index 0 places the substring at the very beginning, and inserting at an index equal to the original string's length appends the substring at the end.

Input format :
The first line contains the original string.

The second line contains the substring to insert.

The third line contains an integer — the index position at which to insert the substring (indexing starts from 0).



Note: A string may contain spaces, so each string must be read as a full line of input.

Output format :
Print the modified string after inserting the substring.



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ length of original string ≤ 100

1 ≤ length of substring to insert ≤ 50

0 ≤ index position ≤ length of original string

Sample test cases :
Input 1 :
HelloWorld
New
6
Output 1 :
HelloWNeworld
Input 2 :
Hello
World
0
Output 2 :
WorldHello
Input 3 :
This is an place
amazing
11
Output 3 :
This is an amazingplace*/
// You are using Java
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int num = sc.nextInt();
        
        /*StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<num; i++){
             sb.append(s1.charAt(i));
            }
            sb.append(s2);
        for(int j = num;j<s1.length();j++){
                sb.append(s1.charAt(j));
            }
        System.out.print(sb.toString());*/
        
        //insert & substring method:
        
        String fpart = s1.substring(0,num);
        String lpart = s1.substring(num);
        String result = fpart + s2+ lpart;
        System.out.print(result);
    }
}
