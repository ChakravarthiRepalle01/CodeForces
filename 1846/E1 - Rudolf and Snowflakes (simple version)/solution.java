import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
 
        int t = in.nextInt();
        precompute();
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
    
   static boolean isPossible[] = new boolean[(int)Math.pow(10,6)+1];
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
        
 
        if(isPossible[n]) {
            out.println("YES");
        }
        else {
            out.println("NO");
        }
 
    }
 
    public static void precompute() {
        long sum = 0;
        long val = 0;
        for(int k = 2 ; k<=1000 ; k++) {
            sum = 1 + k + k*k;
            val = k*k;
 
            while(sum<=Math.pow(10,6)) {
                isPossible[(int)sum] = true;
                val *= k;
                sum += val;
            }
 
        }
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