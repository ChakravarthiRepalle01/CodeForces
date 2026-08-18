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
        // int t = 1;
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        long a = in.nextLong();
        long m = in.nextLong();
 
        long g = calculateGCD(a,m);
 
        long result = m/g;
        long n = m/g;
 
        for(long i=2 ; i*i<=n ; i++) {
            if(n%i == 0) {
                result -= result/i;
                while(n%i == 0) n/=i;
            }
        }
        if(n > 1) result -= result/n;
 
        out.println(result);
    }
 
    public static long calculateGCD(long a , long m) {
        if(m == 0) return a;
        return calculateGCD(m, a%m);
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