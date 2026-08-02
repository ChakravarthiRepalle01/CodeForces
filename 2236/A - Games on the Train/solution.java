import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        while(n>0) {
            solve(sc);
            n--;
        }
        sc.close();
    }
    
    public static void solve(Scanner sc) {
       int n = sc.nextInt();
       int maxNum = 0;
       int minNum = 10;
       
       for(int i = 0 ; i<n ; i++) {
           int h = sc.nextInt();
           minNum = Math.min(h , minNum);
           maxNum = Math.max(h , maxNum);
       }
       System.out.println(maxNum+1-minNum);
    }
}