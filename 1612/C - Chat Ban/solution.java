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
        long k = in.nextLong();
        long x = in.nextLong();
 
        long totalEmotes = k*k;
 
        if( x>= totalEmotes) {
            out.println(2*k-1);
            return;
        }
 
        long low = 1;
        long high = 2*k-1;
 
        while(low<=high) {
            long mid = low + (high-low)/2;
            long currTotal;
 
            if(mid <= k) {
                currTotal = mid*(mid+1)/2;
            }
            else {
                long remaining = mid - k;
                long firstHalf = k*(k+1)/2;
                long decrementLeft = (k-1) - remaining;
                long secondHalf = (k-1)*k/2 - decrementLeft*(decrementLeft+1)/2;
                currTotal = firstHalf + secondHalf;
            }
 
            if(currTotal >= x) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
 
        out.println(low);
 
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