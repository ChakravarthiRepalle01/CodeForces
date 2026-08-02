import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // Number of test cases
        
        while (t > 0) {
            solve(sc);
            t--;
        }
        sc.close();
    }
    
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        boolean found67 = false;
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 67) {
                found67 = true;
            }
        }
        
        if (found67) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}