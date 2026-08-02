import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0) {
            long n , k;
            n = sc.nextInt();
            k = sc.nextInt();
            
            if(k * k <= n && n % 2 == k % 2) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            t--;
        }
    }
}