// You are using Java
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        String longest = "";
        /*for(int i = 0;i<=n;i++){
            for(int j = i+1;j<n+1;j++){
                System.out.println(str.substring(i,j));
            }
            */
        for(int i = 0;i<=n;i++){
            for(int j = i+1; j<n+1;j++){
                String  sub = str.substring(i,j);
                String rev ="";
                for(int k = sub.length()-1;k>=0;k--){
                    rev += sub.charAt(k);
                }
                if(sub.equals(rev) && sub.length()> longest.length()){
                    longest = sub;
                }
            }
        }
        System.out.println(longest.length());
        System.out.println(longest);
        
        }
    }

