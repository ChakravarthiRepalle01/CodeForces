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
       int minElement = Integer.MAX_VALUE;
       long sum = 0;
       
       for(int i = 0 ; i<n ; i++) {
           int k = sc.nextInt();
           minElement = Math.min(minElement , k);
           sum += minElement;
       }
       System.out.println(sum);
    }
}