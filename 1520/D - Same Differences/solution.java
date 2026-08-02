import java.util.*;
 
public class Main{
    
    public static long nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        if (r == 0 || r == n) return 1;
        if (r > n / 2) r = n - r; // Optimization: nCr(n, r) == nCr(n, n-r)
    
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }
    
    public static void solve(Scanner sc) {
      
        int n = sc.nextInt();
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0 ; i<n ; i++){
            int ele = sc.nextInt();
            map.merge((ele-i) , 1 , Integer::sum);
        }
        
        long totalCnt = 0;
        
        for(Map.Entry<Integer , Integer> entry : map.entrySet()) {
            totalCnt += (nCr(entry.getValue() , 2));
        }
        
        System.out.println(totalCnt);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t>0) {
            solve(sc);
            t--;
        }
        
    }
}