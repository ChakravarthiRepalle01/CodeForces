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
        int q = in.nextInt();
 
        int a[] = new int[n];
        int p[] = new int[n];
 
        for(int i = 0 ; i<n ; i++) {
            a[i] = in.nextInt();
        }
 
        for(int i = 0 ; i<q ; i++) {
            int l = (in.nextInt() - 1);
            int r = (in.nextInt() - 1);
            p[l]++;
            if((r+1)<n) p[r+1]--;
        }
 
        for(int i = 1 ; i<n ; i++) {
            p[i] += p[i-1];
        }
 
        Arrays.sort(a);
        Arrays.sort(p);
 
        long totalSum = 0;
 
        for(int i = 0 ;i<n ; i++) {
            totalSum += 1L*a[i]*p[i];
        }
        out.print(totalSum);
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