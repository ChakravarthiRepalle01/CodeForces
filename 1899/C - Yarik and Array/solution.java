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
 
    for(int i = 0 ; i<n ; i++) {
      nums[i] = sc.nextInt();
    }
 
    int maxSum = nums[0];
    int sum = 0;
 
    for(int i = 0 ; i<n ; i++) {
      if(i == 0) {
        sum += nums[i];
        maxSum = Math.max(maxSum , sum);
      }
      else {
        if(sum < 0) {
          sum = 0;
        }
        else {
            if(Math.floorMod(nums[i] , 2) == Math.floorMod(nums[i-1] , 2)) {
                sum = 0;
            }
        }
        sum += nums[i];
        maxSum = Math.max(maxSum , sum);
      }
    }
    System.out.println(maxSum);
  }
 
}