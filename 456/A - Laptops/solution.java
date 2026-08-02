import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int maxQuality;
        
        int arr[][] = new int[n][2];
        
        for(int i = 0 ; i<n ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            arr[i][0] = a;
            arr[i][1] = b;
            
        }
        
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
 
        maxQuality = arr[0][1];
        
        for(int i = 1 ;i<n ; i++) {
            if(arr[i][1] < maxQuality) {
                System.out.println("Happy Alex");
                return;
            }
            maxQuality = Math.max(maxQuality, arr[i][1]);
        }
        System.out.println("Poor Alex");
    }
}