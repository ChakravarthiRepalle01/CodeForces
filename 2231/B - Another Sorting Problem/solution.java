import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        
        int t = in.nextInt();
        while (t-- > 0) {
            solve(in, out);
        }
        out.flush(); 
    }
    
    public static void solve(FastReader in, PrintWriter out) {
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        
        long k = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                k = Math.max(k, a[i] - a[i + 1]);
            }
        }
        
        // If already sorted
        if (k == 0) {
            out.println("YES");
            return;
        }
        
        int[] x = new int[n];
        Arrays.fill(x, -1); // -1 means unassigned
        
        // Step 1: Direct forced assignments from inversions
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                if (x[i] == 1 || x[i + 1] == 0) {
                    out.println("NO");
                    return;
                }
                x[i] = 0;
                x[i + 1] = 1;
            }
        }
        
        // Step 2: Forward propagation of x_i <= x_{i+1}
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] - a[i] < k) { // implies x[i] <= x[i+1]
                if (x[i] == 1) {
                    if (x[i + 1] == 0) {
                        out.println("NO");
                        return;
                    }
                    x[i + 1] = 1;
                }
            }
        }
        
        // Step 3: Backward propagation of x_i <= x_{i+1}
        for (int i = n - 2; i >= 0; i--) {
            if (a[i + 1] - a[i] < k) { // implies x[i] <= x[i+1]
                if (x[i + 1] == 0) {
                    if (x[i] == 1) {
                        out.println("NO");
                        return;
                    }
                    x[i] = 0;
                }
            }
        }
        
        // Step 4: Fill any remaining unassigned elements safely with 0
        for (int i = 0; i < n; i++) {
            if (x[i] == -1) {
                x[i] = 0;
            }
        }
        
        // Step 5: Validate the final modified array
        for (int i = 0; i < n - 1; i++) {
            long val1 = a[i] + x[i] * k;
            long val2 = a[i + 1] + x[i + 1] * k;
            if (val1 > val2) {
                out.println("NO");
                return;
            }
        }
        
        out.println("YES");
    }
 
    static class FastReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}