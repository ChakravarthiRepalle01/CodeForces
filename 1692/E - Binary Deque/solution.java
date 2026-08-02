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
        int n , s , noOfOnes = 0;
        n = sc.nextInt();
        s = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 1) noOfOnes++;
        }
        
        if(noOfOnes<s) {
            System.out.println(-1);
        }
        else if(noOfOnes == s) {
            System.out.println(0);
        }
        else {
            int maxLength = 0;
            int currSum = 0;
            int j = 0;
            
            for(int i = 0 ; i<n ; i++) {
                currSum += arr[i];
                while(currSum>s && j<=i) {
                    currSum -= arr[j];
                    j++;
                }
                if(currSum == s) maxLength = Math.max(maxLength , i-j+1);
            }
            System.out.println(n-maxLength);
        }
        
    }
    
}