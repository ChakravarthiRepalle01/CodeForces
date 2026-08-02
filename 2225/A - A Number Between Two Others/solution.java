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
       long x = sc.nextLong();
       long y = sc.nextLong();
       
       if(y == 2*x) System.out.println("NO");
       else System.out.println("YES");
       
    }
}