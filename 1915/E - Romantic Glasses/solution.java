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
        long arr[] = new long[n];
 
        HashSet<Long> set = new HashSet<Long>();
 
        long totalSum = 0;
 
        for(int i = 0 ; i<n ; i++) {
            arr[i] = in.nextLong();
            if(i%2==0) arr[i] *= -1;
        }
        set.add(0L);
        for(int i = 0 ; i<n ; i++) {
            totalSum += arr[i];
            if(set.contains(totalSum)) {
                out.println("YES");
                return;
            }
            set.add(totalSum);
        }
 
        out.println("NO");
 
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