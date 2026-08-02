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
        long a = sc.nextLong();
        long k = sc.nextLong();
        
        long arr[] = new long[2];
        
        for(long i = 1 ; i<k ; i++) {
            getDigits(a , arr);
            long minNumber = arr[0];
            long maxNumber = arr[1];
            
            if(minNumber == 0) break;
            
            a += minNumber*maxNumber;
        }
        System.out.println(a);
    }
    
    public static void getDigits(long n , long arr[]) {
        long minDigit = 9;
        long maxDigit = 0;
        while(n > 0) {
            minDigit = Math.min(minDigit , n%10);
            maxDigit = Math.max(maxDigit , n%10);
            n/=10;
        }
        arr[0] = minDigit;
        arr[1] = maxDigit;
    }
    
}