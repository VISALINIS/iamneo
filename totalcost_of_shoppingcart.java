/*Babu is developing a program to calculate the total cost of two items in his shopping cart. The program takes the price of the first item, the price of the second item, and an arithmetic operation that represents a discount or an additional charge.

The allowed operations are:

Addition (+) — to combine the two prices
Subtraction (-) — to apply a discount
Multiplication (*) — for bulk or tax calculations
Division (/) — to split the cost


Implement this calculator so that it prints the final total cost based on the chosen operation.

Input format :
The first line contains an integer — the price of the first item.

The second line contains an integer — the price of the second item.

The third line contains a character — the arithmetic operation (+, -, *, or /).

Output format :
Print the result of the operation as follows:

For +, -, and *, print the result as a plain integer (no decimal point).

For /, print the result as a floating-point value rounded to exactly two decimal places (for example, an exact result of 50 is printed as 50.00).



Refer to the sample output for formatting specifications.

Code constraints :
The given testcases fall under the following constraints:

Both prices are integers in the range 1 to 1000.

The operation character is always one of +, -, *, /.

For division, the second price is always at least 1, so division by zero never occurs.

Division is performed as floating-point division and rounded to two decimal places.

Sample test cases :
Input 1 :
250
150
+
Output 1 :
400
Input 2 :
200
3
/
Output 2 :
66.67
*/
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
    

