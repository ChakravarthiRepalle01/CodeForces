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
        int arr[] = new int[n];
        
        for(int i = 0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean res = recursiveSolve(arr , 0 , 0 , n);
        
        if(res) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        
    }
    
    public static boolean recursiveSolve(int arr[] , int currSum , int i , int n) {
        if(i == n) {
            if(currSum%360 == 0) return true;
            else return false;
        }
        
        boolean case1 = recursiveSolve(arr , currSum+arr[i] , i+1 , n);
        boolean case2 = recursiveSolve(arr , currSum-arr[i] , i+1 , n);
        
        return (case1 || case2);
        
    }
    
    
}