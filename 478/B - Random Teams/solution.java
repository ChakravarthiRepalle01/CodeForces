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
        long n = in.nextLong();
        long m = in.nextLong();
 
        long maxPairs = ((n-m+1)*(n-m))/2;
 
        long rem = n%m;
 
        long noOfMemEachTeam = (n-rem)/m;
 
        long minPairs = m*((noOfMemEachTeam)*(noOfMemEachTeam-1))/2;
 
        minPairs += rem*noOfMemEachTeam;
 
        out.println(minPairs + " " + maxPairs);
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