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
 
        long a[] = new long[n];
        long b[] = new long[n];
 
        HashSet<Long> set = new HashSet<>();
 
        for(int i = 0 ; i < n ; i++) {
            a[i] = in.nextLong();
            b[i] = a[i] - i;
            set.add(b[i]);
        }
 
        long maxLen = 0;
 
        for(long val : set) {
            if(!set.contains(val - 1)) {
                long cur = val;
                long len = 1;
 
                while(set.contains(cur + 1)) {
                    cur++;
                    len++;
                }
 
                maxLen = Math.max(maxLen, len);
            }
        }
 
        out.println(maxLen);
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