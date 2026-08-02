import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int noOfGrps = sc.nextInt();
        int grps[] = new int[5];
        for(int i = 0 ; i<noOfGrps ; i++){
            grps[sc.nextInt()]++;
        }
        
        int noOfTaxis = 0;
        
        //4members per taxi
        noOfTaxis += grps[4];
        
        int noOfThreeOnes = Math.min(grps[1] , grps[3]);
        noOfTaxis += noOfThreeOnes;
        grps[3] -= noOfThreeOnes;
        grps[1] -= noOfThreeOnes;
        noOfTaxis += grps[3];
        
        int noOfTwoTwo = grps[2]/2;
        noOfTaxis += noOfTwoTwo;
        grps[2] -= noOfTwoTwo*2;
        //Only one 2 is left or none
        
        if(grps[2]>=1 && grps[1]>=2){
            grps[1] -= 2;
            grps[2]--;
            noOfTaxis++;
        }
        
        int noOfFourOnes = grps[1]/4;
        noOfTaxis += noOfFourOnes;
        grps[1] -= noOfFourOnes*4;
        
        if(grps[2]>=1 && grps[1]>=1){
            grps[1]--;
            grps[2]--;
            noOfTaxis++;
        }
        
        if(grps[1]>0) noOfTaxis++;
        if(grps[2]>0) noOfTaxis++;
        
        System.out.println(noOfTaxis);
        
    }
}