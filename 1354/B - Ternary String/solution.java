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
        String s = sc.next();
        
        int minLength = Integer.MAX_VALUE;
        
        int i = 0;
        int j = 0;
        int n = s.length();
        
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;
        
        while(i<n) {
            while((countOne<1 || countTwo<1 || countThree<1 )&& j<n) {
                if(s.charAt(j) == '1') {
                    countOne++;
                }
                else if(s.charAt(j) == '2') {
                    countTwo++;
                }
                else {
                    countThree++;
                }
                j++;
            }
            
            if (countOne >= 1 && countTwo >= 1 && countThree >= 1) {
                minLength = Math.min(minLength, (j - i)); 
            }
            
            if(s.charAt(i) == '1') countOne--;
            else if(s.charAt(i) == '2') countTwo--;
            else countThree--;
            
            i++;
        }
        
        if(minLength == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(minLength);
        
    }
}