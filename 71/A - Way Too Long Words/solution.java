import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            String input = sc.next();
            int len = input.length();
            if(len>10){
                String result = input.charAt(0) + String.valueOf(len-2) + input.charAt(len-1);
                System.out.println(result);
            }
            else{
                System.out.println(input);
            }
        }
    }
}