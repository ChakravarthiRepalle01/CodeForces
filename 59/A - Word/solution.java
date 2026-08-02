import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int lower = 0;
        int upper = 0;
        int n = s.length();
        
        for(int i = 0 ; i<n ; i++) {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z') lower++;
            else upper++;
        }
        
        if(upper>lower) {
            System.out.println(s.toUpperCase());
        }
        else {
            System.out.println(s.toLowerCase());
        }
        sc.close();
    }
}