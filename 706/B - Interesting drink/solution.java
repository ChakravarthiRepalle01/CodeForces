import java.util.Scanner;
import java.util.Arrays;
 
public class Main{
    public static void main(String[] args){
        //TimeComplexity - O(n log n + k log n + n)
        //SpaceComplexity - O(n + n)
        Scanner sc = new Scanner(System.in);
        
        int noOfShops = sc.nextInt();
        int prices[] = new int[noOfShops];
        for(int i = 0 ; i<noOfShops ; i++){ //O(n)
            prices[i] = sc.nextInt();
        }
        
        Arrays.sort(prices); // O(n log n)
        
        int noOfDays = sc.nextInt();
        
        for(int i = 0 ; i<noOfDays ; i++){ //O(k log n)
            int ele = sc.nextInt();
            int low = 0;
            int high = noOfShops-1;
            int mid;
            
            while(low<=high){
                mid = low + (high-low)/2;
                if(prices[mid]<=ele){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            System.out.println(high+1);
        }
    }
}