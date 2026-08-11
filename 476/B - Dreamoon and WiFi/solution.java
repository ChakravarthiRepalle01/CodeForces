import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
 
 
        // int t = in.nextInt();
        int t = 1;
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        String s = in.next();
        String t = in.next();
 
        int n = s.length();
        double probability = 0;
        int chooseSlots = 0;
        int reqSum = 0;
        int haveSum = 0;
 
        for(int i = 0 ; i<n ; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
 
            if(c1 == '+') reqSum++;
            else reqSum--;
 
            if(c2 == '+') haveSum++;
            else if(c2 == '-') haveSum--;
            else chooseSlots++;
        }
 
        if(chooseSlots == 0) {
            if(reqSum == haveSum) {
                probability = 1;
            }
            else {
                probability = 0;
            }
            out.println(probability);
            return;
        }
 
        int validWays = calculateTotalWays(chooseSlots , reqSum , haveSum);
        double totalWays = Math.pow(2 , chooseSlots);
 
        if(totalWays == 0) probability = 0;
        else probability = validWays/totalWays;
 
        out.println(probability);
    }
 
    public static int calculateTotalWays(int chooseSlots , int reqSum , int haveSum) {
        if(chooseSlots == 0) {
            if(reqSum == haveSum) return 1;
            else return 0;
        }
 
        int case1 = 0;
        int case2 = 0;
 
        case1 = calculateTotalWays(chooseSlots-1, reqSum, haveSum+1);
        
        case2 = calculateTotalWays(chooseSlots-1, reqSum, haveSum-1);
 
        return (case1 + case2);
 
    }
 
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { 
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}