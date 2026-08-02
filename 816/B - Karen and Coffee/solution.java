import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
 
        int t = 1;
 
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n , k , q;
        n = in.nextInt();
        k = in.nextInt();
        q = in.nextInt();
 
        int prefix[] = new int[200000+2];
 
        for(int i = 0 ; i<n ; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            prefix[l]++;
            prefix[r+1]--;
        }
 
        for(int i = 1 ; i<200002 ; i++) {
            prefix[i] += prefix[i-1];
        }
 
        for(int i = 0 ; i<200002 ; i++) {
            if(prefix[i]>=k) {
                prefix[i] = 1;
            }
            else {
                prefix[i] = 0;
            }
        }
 
        for(int i = 1 ; i<200002 ; i++) {
            prefix[i] += prefix[i-1];
        }
 
        for(int i = 0 ; i<q ; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            int res = (prefix[r] - prefix[l-1]);
            out.println(res);
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