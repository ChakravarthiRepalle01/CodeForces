import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        
        // int t = 1;
        int t = in.nextInt();
        
        while(t > 0) {
            solve(in, out);
            t--;
        }
        out.flush(); 
    }
    
    public static void solve(FastReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        
        // Base parities determined by the first odd-indexed (index 0) 
        // and first even-indexed (index 1) elements.
        int oddIndexedParity = a[0] % 2;
        int evenIndexedParity = a[1] % 2;
        
        boolean possible = true;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // For 0-based indexing: index 0, 2, 4... correspond to 1st, 3rd, 5th (odd) positions
                if (a[i] % 2 != oddIndexedParity) {
                    possible = false;
                    break;
                }
            } else {
                // For 0-based indexing: index 1, 3, 5... correspond to 2nd, 4th, 6th (even) positions
                if (a[i] % 2 != evenIndexedParity) {
                    possible = false;
                    break;
                }
            }
        }
        
        if (possible) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }
 
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
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
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                if (st != null && st.hasMoreTokens()) {
                    str = st.nextToken("
");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}