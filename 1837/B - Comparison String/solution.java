import java.util.Scanner;
 
public class Main{
    
    public static void solve(String s){
        int n = s.length();
        int lcount = 0;
        int rcount = 0;
        int maxCount = 0;
        for(int i = 0 ; i<n ; i++){
            if(s.charAt(i)=='<'){
                lcount++;
                maxCount = Math.max(maxCount , rcount);
                rcount = 0;
            }
            else{
                rcount++;
                maxCount = Math.max(maxCount , lcount);
                lcount=0;
            }
        }
        maxCount = Math.max(maxCount , Math.max(lcount , rcount));
        System.out.println(maxCount+1);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int k = sc.nextInt();
            String str = sc.next();
            solve(str);
            n--;
        }
    }
}