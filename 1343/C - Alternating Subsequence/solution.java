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
        
        int n = sc.nextInt();
        
        long totalSum = 0;
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i<n ; i++) arr[i] = sc.nextInt();
        
        int i = 0;
        
        while(i<n) {
            
            long maxValue = arr[i];
            int currentSign = getSign(arr[i]);
            
            while(i<n && currentSign == getSign(arr[i])) {
                maxValue = Math.max(maxValue , (long)arr[i]);
                i++;
            }
            
            totalSum += maxValue;
        }
        
        System.out.println(totalSum);
    }
    
    public static int getSign(int n) {
        return (n>=0 ? 0 : 1);
    }
    
}