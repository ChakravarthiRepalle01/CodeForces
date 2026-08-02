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
        int n = sc.nextInt();
        
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        
        for(int i = 0 ; i<n ; i++) {
            arr1[i] = sc.nextInt();
        }
        
        Arrays.sort(arr1);
        
        int low = 0;
        int high = (n-1);
        int idx = (n-1);
        while(low<=high) {
            
            if(low == high) {
                arr2[idx--] = arr1[low];
                break;
            }
            
            arr2[idx--] = arr1[high];
            arr2[idx--] = arr1[low];
            low++;
            high--;
        }
        
        for(int i = 0 ; i<n ; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        
    }
}