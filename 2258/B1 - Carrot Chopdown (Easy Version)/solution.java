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
        int freq[] = new int[m+1];
 
        for(int i = 0 ; i<n ; i++) {
            nums[i] = in.nextInt();
            freq[nums[i]]++;
        }
 
        int suffix[] = new int[m+2];
 
        for(int i = m ; i>=0 ; i--) {
            suffix[i] = suffix[i+1] + freq[i];
        }
 
        int maxCuts = 0;
 
        for(int i = 1 ; i<=m ; i++) {
            int countX = freq[i];
            int count2x = (2*i <= m) ? freq[2*i] : 0;
            int greater = suffix[i+1];
 
            int cuts = count2x + countX + greater;
            if(cuts > maxCuts) {
                maxCuts = cuts;
            }
 
        }
        out.println(maxCuts);
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