import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
 
        int t = 1;
        t = in.nextInt();
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
 
        String a = in.next();
        String b = in.next();
 
        int noOfZeros = 0;
        int noOfOnes = 0;
        boolean isInverted = false;
 
        for(int i = 0 ; i<n ; i++) {
            if(a.charAt(i) == '0') noOfZeros++;
            else noOfOnes++;
        }
 
        for(int i = (n-1) ; i>=0 ; i--) {
            char sec = b.charAt(i);
            char fir = a.charAt(i);
            fir = (isInverted) ? ((fir == '0') ? '1' : '0') : fir;
 
            if(fir == sec) {
                if(fir == '0') noOfZeros--;
                else noOfOnes--;
            }
            else {
                if(noOfOnes != noOfZeros) {
                    out.println("NO");
                    return;
                }
                noOfOnes = noOfOnes ^ noOfZeros;
                noOfZeros = noOfOnes ^ noOfZeros;
                noOfOnes = noOfOnes ^ noOfZeros;
                isInverted = !isInverted;
 
                if(fir == '0') noOfOnes--;
                else noOfZeros--;
 
            }
        }
        out.println("YES");
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