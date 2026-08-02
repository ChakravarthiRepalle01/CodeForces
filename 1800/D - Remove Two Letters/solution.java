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
        String s = sc.next();
        int k = (n-1);
        
        for(int i = 0 ; i<(n-2) ; i++) {
            if( s.charAt(i) == s.charAt(i+2) ) k--;
        }        
        System.out.println(k);
    }
    
}