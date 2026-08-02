import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        
        int noOfBlocksColumn = (int)Math.ceil((double)n/a);
        int noOfBlocksRow = (int)Math.ceil((double)m/a);
        
        System.out.println((long)noOfBlocksColumn*noOfBlocksRow);
    }
}