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
        // t = in.nextInt();
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
        int t = in.nextInt();
 
        int nums[] = new int[n];
 
        for(int i = 0 ; i<n ; i++) {
            nums[i] = in.nextInt();
        }
 
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        
        for(int i = 1 ; i<n ; i++) {
            prefix[i] = nums[i] + prefix[i-1];
        }
 
        int totalCnt = 0;
 
        for(int i = 0 ; i<n ; i++) {
            int remove = (i!=0) ? prefix[i-1] : 0;
 
            int low = i;
            int high = (n-1);
            int mid;
 
            while(low <= high) {
                mid = low + (high-low)/2;
                if((prefix[mid]-remove) <= t) {
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
            totalCnt = Math.max(totalCnt, high - i + 1);
        }
        out.println(totalCnt);
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