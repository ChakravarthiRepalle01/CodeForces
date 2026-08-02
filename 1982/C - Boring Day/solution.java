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
        int l = sc.nextInt();
        int r = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        
        int totalWins = 0;
        long totalSum = 0;
        
        int i = 0;
        int j = 0;
        
        while(j<n) {
            totalSum += arr[j++];
            
            while(i<n && totalSum > r) {
                totalSum -= arr[i++];
            }
            
            if(totalSum>=l && totalSum<=r) {
                totalWins++;
                totalSum = 0;
                i = j;
            }
        }
        System.out.println(totalWins);
    }
}