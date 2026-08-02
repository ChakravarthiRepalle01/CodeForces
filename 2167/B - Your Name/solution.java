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
        int have[] = new int[26];
        int need[] = new int[26];
        
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        
        for(int i = 0 ; i<n ; i++) {
            char haveChar = s.charAt(i);
            char needChar = t.charAt(i);
            
            have[haveChar-'a']++;
            need[needChar-'a']++;
        }
        
        for(int i = 0 ; i<26 ; i++) {
            if(have[i]!=need[i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}