import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for(int i = 0 ; i<n ; i++){
            String input = sc.next();
            if(input.charAt(0) == 'X'){
                if(input.charAt(2)=='+'){
                    x = x+1;
                }
                else{
                    x = x-1;
                }
            }
            else if(input.charAt(0) == '+'){
                x = x+1;
            }
            else{
                x = x-1;
            }
        }
        System.out.println(x);
    }
}