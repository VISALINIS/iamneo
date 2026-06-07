import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().replace(" ","").toLowerCase();
        String s2 = sc.nextLine().replace(" ","").toLowerCase();
        
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        if(Arrays.equals(ch1,ch2)){
            System.out.print("Anagrams");
        }
        else{
            System.out.print("Not Anagrams");
        }
        
        
    }
}
