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
 
        int nums[] = new int[n];
 
        for(int i = 0 ; i<n ; i++) {
            nums[i] = in.nextInt();
        }
 
        int minValue = 1;
        int maxValue = n;
 
        int l = 0;
        int r = (n-1);
 
        while(l < r) {
            if(nums[l]!=minValue && nums[l]!=maxValue && nums[r]!=minValue && nums[r]!=maxValue) {
                out.println((l+1) + " " + (r+1));
                return;
            }
            else {
                if(nums[l] == minValue) {
                    l++;
                    minValue++;
                }
                else if(nums[l] == maxValue) {
                    l++;
                    maxValue--;
                }
                else if(nums[r] == minValue) {
                    r--;
                    minValue++;
                }
                else {
                    r--;
                    maxValue--;
                }
            }
        }
 
        out.println(-1);
 
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