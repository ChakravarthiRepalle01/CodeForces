import java.util.Scanner;
import java.util.Arrays;
 
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
    int k = sc.nextInt();
 
    long maxExperience = 0;
    long maxBValue = 0;
 
    int a[] = new int[n];
    int b[] = new int[n];
    long prefix[] = new long[n];
 
    for(int i = 0 ; i<n ; i++) {
      a[i] = sc.nextInt();
    }
 
    for(int i = 0 ; i<n ; i++) {
      b[i] = sc.nextInt();
    }
 
    prefix[0] = a[0];
 
    for(int i = 1 ; i<n ; i++) {
      prefix[i] = prefix[i-1] + a[i];
    }
 
    for(int i = 0 ; i<Math.min(n , k) ; i++) {
      maxBValue = Math.max(maxBValue , b[i]);
 
      maxExperience = Math.max(maxExperience , prefix[i] + (k-i-1)*maxBValue);
    }
 
    System.out.println(maxExperience);
  }
 
}