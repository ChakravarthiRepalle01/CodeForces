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
 
        int x = (n*(n-1))/2;
 
        int nums[] = new int[x];
        int res[] = new int[n];
 
        for(int i = 0 ; i<x ; i++) nums[i] = in.nextInt();
 
        Arrays.sort(nums);
 
        int i = 0;
        int index = 0;
 
        while(i < x) {
            int addIndex = (n-1-index);
            res[index++] = nums[i];
            i+=(addIndex);
        }
 
        for(i = index ; i<n ; i++) {
            res[i] = nums[x-1];
        }
 
 
        for(i = 0 ; i<n ; i++) {
            out.print(res[i]+ " ");
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