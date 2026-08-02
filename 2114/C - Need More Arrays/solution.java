import java.util.Scanner;
 
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noOfCases = sc.nextInt();
        
        for(int i = 0 ; i<noOfCases ; i++){
            int len = sc.nextInt();
            
            if(len<=0){
                System.out.println(0);
                continue;
            }
            
            int prev = sc.nextInt();
            int unqArr = 1;
            for(int j = 1 ; j<len ; j++){
                int k = sc.nextInt();
                if(prev+1<k){
                    unqArr++;
                    prev = k;
                }
            }
            System.out.println(unqArr);
        }
    }
}