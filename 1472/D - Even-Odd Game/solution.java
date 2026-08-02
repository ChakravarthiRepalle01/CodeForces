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
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        int chance = 0;
        long alice = 0;
        long bob = 0;
        
        for(int i = (n-1) ; i>=0 ; i--) {
            if(chance == 0) {
                if(arr[i]%2==0) alice += arr[i];
            }
            else {
                if(arr[i]%2==1) bob += arr[i];
            }
            chance = (1-chance);
        }
        
        if(alice>bob) {
            System.out.println("Alice");
        }
        else if(bob>alice) {
            System.out.println("Bob");
        }
        else{
            System.out.println("Tie");
        }
        
    }
    
}