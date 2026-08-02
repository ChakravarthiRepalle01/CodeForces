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
 
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
 
        long a[] = new long[n];
        long p[] = new long[n];
        long sp[] = new long[n];
 
        for(int i = 0 ; i<n ; i++) {
            a[i] = in.nextLong();
        }
 
        p[0] = a[0];
 
        for(int i = 1 ; i<n ; i++) {
            p[i] = p[i-1] + a[i];
        }
        Arrays.sort(a);
 
        sp[0] = a[0];
 
        for(int i = 1 ; i<n ; i++) {
            sp[i] = sp[i-1] + a[i];
        }
 
        int q = in.nextInt();
 
        for(int i = 0 ; i<q ; i++) {
            int type = in.nextInt();
            int l = (in.nextInt()-1);
            int r = (in.nextInt()-1);
            if(type == 1) {
                out.println((p[r] - ((l>0) ? p[l-1] : 0)));
            }
            else {
                out.println((sp[r] - ((l>0) ? sp[l-1] : 0)));
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