import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        long result = 0;
        int cnt = 0;
        long k = 0;
        
        while(n>0) {
            k = n%10;
            k = Math.min(k , Math.abs(9-k));
            result = (k*(long)Math.pow(10 , cnt++) + result);
            n /= 10;
        }
        
        if (k==0) result = (9*(long)Math.pow(10 , (cnt-1)) + result);
        
        System.out.println(result);
        
    }
}