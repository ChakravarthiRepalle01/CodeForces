import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        sieveSolve();
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        
        int t = 1;
        // int t = in.nextInt();
        
        while(t > 0) {
            solve(in, out);
            t--;
        }
        out.flush(); 
    }
    
    public static boolean isPerfectSquare(long n) {
        long result = (long)Math.sqrt(n);
        
        return (result*result == n);
    }
    
    static boolean sieve[] = new boolean[1000002];
    public static void sieveSolve() {
        
        sieve[0] = true;
        sieve[1] = true;
        for (int i = 2; i * i < 1000002; i++) {
            if (!sieve[i]) {
                for (int j = i * i; j < 1000002; j += i) {
                    sieve[j] = true;
                }
            }
        }
    }
    
    public static void solve(FastReader in, PrintWriter out) {
        int n = in.nextInt();
        long arr[] = new long[n];
        
        for(int i = 0 ; i<n ; i++) {
            arr[i] = in.nextLong();
        }
        
        
        for(int i = 0 ; i<n ; i++) {
            if(arr[i]%2==0) {
                if(arr[i] == 4) out.println("YES");
                else out.println("NO");
            }
            else {
                if(isPerfectSquare(arr[i])) {
                    long sqrt = (long)Math.sqrt(arr[i]);
                    if(!sieve[(int)(sqrt)]) out.println("YES");
                    else out.println("NO");
                }
                else {
                    out.println("NO");
                }
            }
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