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
 
        long nums[] = new long[n];
 
        for(int i = 0 ; i<n ; i++) {
            nums[i] = in.nextLong();
        }
 
        for(int i = 1 ; i<=64 ; i++) {
            int count = 0;
 
            for(int j = 0 ; j<n ; j++) {
                if(((nums[j] >> (i-1)) & 1L) == 1L) count++;
            }
 
            if(count>0 && count<n) {
                out.println(1L<<i);
                return;
            }
 
        }
        out.println("KCPD");
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