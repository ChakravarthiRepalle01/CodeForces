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
 
        long totalSum = 0;
        long maxSubSum = 0;
        long sum = 0;
        int idx = -1;
 
        int nums[] = new int[n];
 
        for(int i = 0 ; i<n ; i++) {
            nums[i] = in.nextInt();
            totalSum += nums[i];
        }
 
        //Kadane's Algorithm
        for(int i = 0 ; i<n ; i++) {
            sum += nums[i];
            if((i-idx)<n) maxSubSum = Math.max(maxSubSum , sum);
            if(sum <= 0) {
                sum = 0;
                idx = i;
            }
        }
 
        if(totalSum > maxSubSum) {
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