import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int piles[] = new int[n];
        
        for(int i = 0 ; i<n ; i++) {
            piles[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        
        int prefix[] = new int[n];
        int sum = 0;
        
        for(int i = 0 ; i<n ; i++){
            sum += piles[i];
            prefix[i] = sum;
        }
        
        //O(n+n+mlogn)
        
        //i want to find element such that the greatest number piles[i]>=q
        
        for(int i = 0 ; i<m ; i++){
            int target = sc.nextInt();
            
            int low = 0;
            int high = (n-1);
            int mid;
            
            while(low<=high){
                mid = low + (high - low)/2;
                if(prefix[mid]<target) low = mid+1;
                else high = mid-1;
            }
            System.out.println((low+1));
        }
        
    }
}