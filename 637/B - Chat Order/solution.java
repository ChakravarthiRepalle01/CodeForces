import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 1;
        
        while(n>0) {
            solve(sc);
            n--;
        }
        sc.close();
    }
    
    public static void solve(Scanner sc) {
        
        int n = sc.nextInt();
        String arr[] = new String[n];
        
        for(int i = 0 ; i<n ; i++) {
            arr[i] = sc.next();
        }
        
        HashSet<String> set = new HashSet<String>();
        
        for(int i = (n-1) ; i>=0 ; i--) {
            if(!set.contains(arr[i])) {
                System.out.println(arr[i]);
                set.add(arr[i]);
            }
        }
        
    }
}