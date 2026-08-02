import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int n = str.length();
        
        for(int i = 0 ; i<n ; i++) {
            if(str.charAt(i) == 'H' || str.charAt(i) == 'Q' || str.charAt(i) == '9') {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}