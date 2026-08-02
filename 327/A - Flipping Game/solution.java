import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int maxOnes = 0;
        
        // Try every possible subarray starting at i and ending at j
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentOnes = 0;
                
                // Count ones after flipping the window [i, j]
                for (int k = 0; k < n; k++) {
                    if (k >= i && k <= j) {
                        currentOnes += (1 - nums[k]); // Flipped value
                    } else {
                        currentOnes += nums[k];       // Original value
                    }
                }
                maxOnes = Math.max(maxOnes, currentOnes);
            }
        }
        
        System.out.println(maxOnes);
        sc.close();
    }
}