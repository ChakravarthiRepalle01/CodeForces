import java.util.*;
 
public class Main{
    
    public static void InsertionSort(int arr[] , int n){
        for(int j = 1 ; j<n ; j++){
            int i = j;
            while(i>0&&arr[i]<arr[i-1]){
                int ele = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = ele;
                
                i--;
            }
        }
    }
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int maxPairs = 0;
        
        int n = sc.nextInt();
        int boys[] = new int[n];
        for(int i = 0 ; i<n ; i++) boys[i] = sc.nextInt();
        
        int m = sc.nextInt();
        int girls[] = new int[m];
        for(int i = 0 ; i<m ; i++) girls[i] = sc.nextInt();
        
        InsertionSort(boys , n);
        InsertionSort(girls , m);
        
        int i = 0;
        int j = 0;
        
        while(i<n&&j<m) {
            if(Math.abs(boys[i] - girls[j])<=1){
                maxPairs++;
                i++;
                j++;
            }
            else if(boys[i]<girls[j]) i++;
            else j++;
        }
        System.out.println(maxPairs);
    }
}