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
        // int t = 1;
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
 
        long i = -1;
        long j = -1;
 
        //Find i , j;
 
        int low = 1;
        int high = (n-1);
        int mid;
 
        while(low<=high) {
            mid = low + (high-low)/2;
 
            long upTo = (long)mid*(mid+1)/2;
 
            if(upTo >= k) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
 
        }
 
        i = (n-low);
        
        long grpEndsAt = (long)(low)*(low+1)/2;
        j = (i+1+grpEndsAt-k);
 
        StringBuilder sb = new StringBuilder();
 
        for(int x = 1 ; x<=n ; x++) {
            if(x == i || x == j) {
                sb.append('b');
            }
            else {
                sb.append('a');
            }
        }
 
        out.println(sb.toString());
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