import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noOfApples = sc.nextInt();
        
        int noOfOneHun = 0;
        int noOfTwoHun = 0;
        
        for(int i = 0 ; i<noOfApples ; i++){ //O(noOfApples)
            int input = sc.nextInt();
            if(input==100) noOfOneHun++;
            else noOfTwoHun++;
        }
        
        if(noOfOneHun%2!=0 || noOfOneHun==0&&noOfTwoHun%2!=0) System.out.println("NO");
        else System.out.println("YES");
    
        
    }
}