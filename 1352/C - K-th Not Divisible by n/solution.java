import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t>0) {
            
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int row = (k/(n-1) + Math.min(1,k%(n-1)));
            int col = k%(n-1);
            if(col == 0) col = (n-1);
            int res = (n*(row-1) + col);
            System.out.println(res);
            
            t--;
        }
    }
}