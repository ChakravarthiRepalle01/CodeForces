import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noOfFriends = sc.nextInt();
        int countOfFingers = 0;
        for(int i = 0 ; i<noOfFriends ; i++){
            countOfFingers += sc.nextInt();
        }
        int validWays = 0;
        for(int i = 1 ; i<=5 ; i++){
            if((countOfFingers+i)%(noOfFriends+1)!=1) validWays++;   
        }
        System.out.println(validWays);
    }
}