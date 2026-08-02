import java.util.*;
 
public class Main {
    
    public static void solve(Scanner sc) {
        
        int n = sc.nextInt();
        long c , k;
        
        c = sc.nextLong();
        k = sc.nextLong();
        
        long arr[] = new long[n];
        
        for(int i = 0 ; i<n ; i++) {
            arr[i] = sc.nextLong();
        }
        
        Arrays.sort(arr);
        
        for(int i = 0 ; i<n ; i++) {
            if(arr[i]<=c) {
                
                long diff = (c-arr[i]);
                arr[i] += Math.min(k , diff);
                k -= Math.min(k , diff);
                
                c += arr[i];
            }
            else break;
        }
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        while(n>0) {
            solve(sc);
            n--;
        }
    }
}