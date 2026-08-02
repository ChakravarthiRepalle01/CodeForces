import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int price1 = n*a;
        int remRides = n%m;
        int totRides = n/m;
        int price2 = totRides*b + remRides*a;
        int price3 = (totRides+1)*b;
        
        int finalPrice = Math.min(price1 , Math.min(price2 , price3));
        System.out.println(finalPrice+"
");
        
    }
}