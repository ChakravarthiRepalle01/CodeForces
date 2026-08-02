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
 
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
        int arr[] = new int[n];
        int p[] = new int[n];
 
        for(int i = 0 ; i<n ; i++) {
            arr[i] = in.nextInt();
        }
 
        p[0] = -1;
        for(int i = 1 ; i<n ; i++) {
            if(arr[i]!=arr[i-1]) p[i] = (i-1);
            else p[i] = p[i-1];
        }
 
        int q = in.nextInt();
 
        while(q>0) {
            q--;
            int l = (in.nextInt()-1);
            int r = (in.nextInt()-1);
 
            if(p[r] < l) {
                out.println(-1 + " " + -1);
            }
            else {
                out.println((p[r]+1)+" "+(r+1));
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