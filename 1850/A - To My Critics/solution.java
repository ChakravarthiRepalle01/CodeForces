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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if((a+b)>=10 || (b+c)>=10 || (a+c)>=10) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        
    }
}