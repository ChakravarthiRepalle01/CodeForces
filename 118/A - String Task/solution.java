import java.util.Scanner;
 
public class Main{
    
    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='y'){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int len = input.length();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<len ; i++){
            char c = input.charAt(i);
            if(!isVowel(c)){
                sb.append('.');
                if(c>=65&&c<=90){
                    sb.append((char)(c+32));
                }
                else{
                    sb.append(c);
                }
            }
        }
        System.out.println(sb.toString());
    }
}