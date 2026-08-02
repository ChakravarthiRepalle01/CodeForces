import java.util.Scanner;
import java.util.Arrays;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int noOfLanterns = sc.nextInt();
        int lengthOfStreet = sc.nextInt();
        
        int lanternPos[] = new int[noOfLanterns];
        for(int i = 0 ; i<noOfLanterns ; i++){
            lanternPos[i] = sc.nextInt();
        }
        
        Arrays.sort(lanternPos);
        
        double maxDistance = 0;
        maxDistance = Math.max(lanternPos[0]-0 , lengthOfStreet - lanternPos[noOfLanterns-1]);
        
        for(int i = 0 ; i<noOfLanterns-1 ; i++){
            maxDistance = Math.max(maxDistance , (double)0.5*(lanternPos[i+1] - lanternPos[i]));
        }
        System.out.println(maxDistance);
        
    }
}