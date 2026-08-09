import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
 
public class Main {
    static int arr[] = new int[2*(int)Math.pow(10,5)+1];
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
 
 
        int t = in.nextInt();
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
 
        int minRange = Integer.MAX_VALUE;
 
        if(a == b && b == c && c == a) {
            out.println(0);
            return;
        } 
        minRange = Math.min(minRange , Math.max(a , Math.max(b,c)) - Math.min(a , Math.min(b,c)));
        minRange = Math.min(minRange , Math.max(a,b));
        minRange = Math.min(minRange , Math.max(c,b));
        minRange = Math.min(minRange , Math.max(a,c));
 
        out.println(minRange);
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