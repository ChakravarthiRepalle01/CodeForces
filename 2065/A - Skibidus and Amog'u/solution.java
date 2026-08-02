import java.util.Scanner;
import java.lang.StringBuilder;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int noOfStrings = sc.nextInt();
        for(int i = 0 ; i<noOfStrings ; i++){
            String input = sc.next();
            StringBuilder sb = new StringBuilder();
            int n = input.length();
            
            for(int j = 0 ; j<n-2 ; j++){
                sb.append(input.charAt(j));
            }
            
            sb.append("i");
            System.out.println(sb.toString());
        }
    }
}