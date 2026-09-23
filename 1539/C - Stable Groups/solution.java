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
        long k = in.nextLong();
        long x = in.nextLong();
 
        long nums[] = new long[n];
 
        for(int i = 0 ; i<n ; i++) {
            nums[i] = in.nextLong();
        }
 
        Arrays.sort(nums);
 
        List<Long> gaps = new ArrayList<>();
 
        for(int i = 1 ; i<n ; i++) {
            long diff = nums[i] - nums[i-1];
            if(diff > x) {
                long needed = (diff-1)/x;
                gaps.add(needed);
            }
        }
 
        Collections.sort(gaps);
 
        long totalGroups = gaps.size() + 1;
 
        for(long needed : gaps) {
            if( k>= needed) {
                k -= needed;
                totalGroups--;
            }
            else {
                break;
            }
        }
 
        out.println(totalGroups);
 
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