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
        int n ,x , m;
 
        n = in.nextInt();
        x = in.nextInt();
        m = in.nextInt();
    
        int leftBound = x;
        int rightBound = x;
 
        for(int i = 0 ; i<m ; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
 
            if(r>=leftBound && l<=rightBound) {
                leftBound = Math.min(leftBound , l);
                rightBound = Math.max(rightBound , r);
            }
        }
 
        out.println(rightBound - leftBound + 1);
 
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