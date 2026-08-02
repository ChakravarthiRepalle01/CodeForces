import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        while(n>0) {
            solve(sc);
            n--;
        }
    }
    
    public static void solve(Scanner sc) {
        int n , k;
        n = sc.nextInt();
        k = sc.nextInt();
        
        if(k>n) {
            System.out.println("NO");
            return;
        }
        
        int case1 = (n-(k-1));
        int case2 = (n - 2*(k-1));
        
        if(case1%2==1) {
            System.out.println("YES");
            for(int i = 0 ; i<(k-1) ; i++) {
                System.out.print(1 + " ");
            }
            System.out.println(case1);
        }
        else if(case2>0 && case2%2==0) {
            System.out.println("YES");
            for(int i = 0 ; i<(k-1) ; i++) {
                System.out.print(2 + " ");
            }
            System.out.println(case2);
        }
        else {
            System.out.println("NO");
        }
        
    }
    
}