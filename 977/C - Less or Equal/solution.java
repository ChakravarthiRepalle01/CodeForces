import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        // Case 1: k is 0
        if (k == 0) {
            // If the smallest element is greater than 1, we can pick x = 1
            if (arr[0] > 1) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        } 
        // Case 2: k is between 1 and n
        else {
            // Check if the k-th element (1-indexed) is equal to the (k+1)-th element
            if (k < n && arr[k] == arr[k-1]) {
                System.out.println(-1);
            } else {
                System.out.println(arr[k-1]);
            }
        }
        
        sc.close();
    }
}