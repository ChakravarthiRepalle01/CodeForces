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
        int n = in.nextInt();
        int m = in.nextInt();
 
        int nums[] = new int[n];
        int cost[] = new int[m];
 
        for(int i = 0 ; i<n ; i++) {
            nums[i] = in.nextInt();
        }
 
        for(int i = 0 ; i<m ; i++) {
            cost[i] = in.nextInt();
        }
 
        Arrays.sort(nums);
 
        int currPoint = 0;
        long totalCost = 0;
 
        for(int i = (n-1) ; i>=0 ; i--) {
            if(cost[nums[i]-1] <= cost[currPoint]) {
                totalCost += cost[nums[i]-1];
            }
            else {
                totalCost += cost[currPoint++];
            }
        }
 
        out.println(totalCost);
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