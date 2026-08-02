import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
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
        int n , m , k;
        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt();
        long a[] = new long[n];
        int q[][]=new int[m][3];
        long qc[]=new long[m];
 
        for(int i = 0 ; i<n ; i++) {
            a[i] = in.nextLong();
        }
 
        for(int i = (n-1) ; i>=1 ; i--) {
            a[i] -= a[i-1];
        }
 
        for(int i = 0 ; i<m ; i++) {
            q[i][0] = (in.nextInt()-1);
            q[i][1] = (in.nextInt()-1);
            q[i][2] = in.nextInt();
        }
 
        for(int i = 0 ; i<k ; i++) {
            int x = (in.nextInt()-1);
            int y = (in.nextInt()-1);
            qc[x]++;
            if((y+1)<m) qc[y+1]--;
        }
 
        for(int i = 1 ; i<m ; i++) {
            qc[i] += qc[i-1];
        }
 
        for(int i = 0 ; i<m ; i++) {
            long times = qc[i];
            int l = q[i][0];
            int r = q[i][1];
            long d = q[i][2];
            a[l] += d*times;
            if((r+1)<n) a[r+1] -= d*times;
        }
 
        for(int i=1 ; i<n ; i++) {
            a[i] += a[i-1];
        }
 
        for(int i = 0 ; i<n ; i++) {
            out.print(a[i] + " ");
        }
        out.println();
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