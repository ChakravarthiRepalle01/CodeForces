import java.util.*;
 
public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
 
      int t = sc.nextInt();
 
      while(t > 0) {
        solve(sc);
        t--;
      }
 
      sc.close();
 
    }
 
    public static void solve(Scanner sc) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int k = sc.nextInt();
 
      int noOfCardsPer = n/k;
 
      if(noOfCardsPer >= m) {
        System.out.println(m);
      }
      else {
        int remainingPlayers = (k-1);
        int remJokers = (m-noOfCardsPer);
        int firstShare = remJokers/remainingPlayers;
        if(remJokers%remainingPlayers != 0) {
          firstShare++;
        }
        System.out.println(n/k - firstShare);
      }
 
    }
 
}