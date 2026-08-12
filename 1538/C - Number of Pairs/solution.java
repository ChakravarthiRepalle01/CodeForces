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
        int l = in.nextInt();
        int r = in.nextInt();
 
        int nums[] = new int[n];
 
        for(int i = 0 ; i<n ; i++) nums[i] = in.nextInt();
 
        Arrays.sort(nums);
 
        long totalPairs = 0;
 
        for(int i = 0 ; i<n ; i++) {
            //for each ai find aj that is in range of l-ai and r-ai
            int ai = nums[i];
 
            int firstIdx = n;
            int lastIdx = -1;
 
            int low = i+1;
            int high = (n-1);
            int mid;
 
            while(low<=high) {
                mid = low + (high-low)/2;
                if(nums[mid] >= (l-ai)) {
                    firstIdx = mid;
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
 
            low = i+1;
            high = (n-1);
 
            while(low<=high) {
                mid = low + (high-low)/2;
                if(nums[mid]<=(r-ai)) {
                    lastIdx = mid;
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
 
            if(firstIdx<=lastIdx) totalPairs += (lastIdx-firstIdx+1);
        }
 
        out.println(totalPairs);
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