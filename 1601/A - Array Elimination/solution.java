import java.util.Scanner;
 
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
    int nums[] = new int[n];
    int freq[] = new int[32];
 
    for(int i = 0 ; i<n ; i++) nums[i] = sc.nextInt();
 
    for(int i = 0 ; i<32 ; i++) {
      for(int j = 0 ; j<n ; j++) {
        if(((nums[j] >> i) & 1) == 1) freq[i]++;
      }
    }
 
    for(int k = 1 ; k<=n ; k++) {
      boolean isGood = true;
      for(int i = 0 ; i<32 ; i++) {
        if(freq[i]%k!=0) {
          isGood = false;
          break;
        }
      }
      if(isGood) {
        System.out.print(k + " ");
      }
    }
    System.out.println();
  }
 
}