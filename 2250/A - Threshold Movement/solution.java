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
 
        for(int i = 0 ; i<n ; i++) {
            arr[i] = in.nextInt();
        }
 
        if(n%2!=0) {
            out.println("NO");
            return;
        }
 
        int low = Integer.MIN_VALUE;
        int high = Integer.MAX_VALUE;
;
 
        for (int i = 0; i < n; i += 2) {
            int ele1 = arr[i];     // Must move right -> k < ele1
            int ele2 = arr[i + 1]; // Must move left  -> k > ele2
 
            low = Math.max(low, ele2 + 1);
            high = Math.min(high, ele1 - 1);
        }
 
        if(low<=high) {
            out.println("YES");
        }
        else {
            out.println("NO");
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