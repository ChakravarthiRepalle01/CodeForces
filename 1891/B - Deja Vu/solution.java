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
    int q = sc.nextInt();
 
    long nums[] = new long[n];
    long x[] = new long[q];
 
    for(int i = 0 ; i<n ; i++) {
      nums[i] = sc.nextInt();
    }
 
    for(int i = 0 ; i<q ; i++) {
      x[i] = sc.nextLong();
    }
 
    long minX = x[0];
 
    ArrayList<Long> list = new ArrayList<Long>();
 
    list.add(minX);
 
    for(int i = 1 ; i<q ; i++) {
      if(x[i] < minX) {
        list.add(x[i]);
        minX = x[i];
      }
    }
 
    for(long i : list) {
      for(int j = 0 ; j<n ; j++) {
        if(nums[j] % (1 << i) == 0) {
          nums[j] = nums[j] + (1 << (i-1));
        }
      }
    }
 
    for(int i = 0 ; i<n ; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
}