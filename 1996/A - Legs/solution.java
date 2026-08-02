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
        int totalLegs = sc.nextInt();
        
        int noOfCows = totalLegs/4;
        totalLegs %= 4;
        int noOfChickens = totalLegs/2;
        
        System.out.println(noOfCows+noOfChickens);
        
    }
}