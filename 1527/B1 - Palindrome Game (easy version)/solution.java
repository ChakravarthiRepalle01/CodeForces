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
        String s = sc.next();
        
        int noOfZeros = 0;
        
        for(int i = 0 ; i<n ; i++) {
            if(s.charAt(i) == '0') noOfZeros++;
        }
        
        if(noOfZeros == 0) {
            System.out.println("DRAW");
        }
        else if(noOfZeros == 1 || noOfZeros%2 == 0) {
            System.out.println("BOB");
        }
        else {
            System.out.println("ALICE");
        }
        
    }
    
}