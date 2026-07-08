import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.next();
        }
        String res = "";
        Arrays.sort(arr);
    char[] first = arr[0].toCharArray();
    char[] last = arr[n-1].toCharArray();
    int len = Math.min(first.length,last.length);
    for(int i = 0;i<len;i++){
        if(first[i]!=last[i]){
            break;
        }
        res+=first[i];
    }
    System.out.print(res);
    }
}
