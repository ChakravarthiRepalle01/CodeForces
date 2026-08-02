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
        int n , x;
        n = sc.nextInt();
        x = sc.nextInt();
        
        int noOfOdds = 0;
        int noOfEvens = 0;
        
        for(int i = 0 ; i<n ; i++) {
            int k = sc.nextInt();
            if(k%2!=0) noOfOdds++;
            else noOfEvens++;
        }
        
        if(noOfOdds<=0) {
            System.out.println("NO");
            return;
        }
        
        int canOccupy = 0;
        
        if(noOfOdds%2==0) {
            canOccupy = Math.min(x , (noOfOdds-1));
        }
        else {
            canOccupy = Math.min(x , noOfOdds);
        }
        
        if(canOccupy%2==0) {
            canOccupy = Math.max(0 , canOccupy-1);
        }
        
        int wanted = (x - canOccupy);
        
        if(wanted<=0 || noOfEvens>=wanted) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
    
}