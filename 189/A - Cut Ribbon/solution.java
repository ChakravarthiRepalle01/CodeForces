import java.io.*;
import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
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
    
    public static void solve(FastReader in, PrintWriter out) {
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        int dp[] = new int[n+1];
        Arrays.fill(dp , -1);
        
        int maxCuts = maxCutsCalc(n , a , b , c , dp);
        
        out.println(maxCuts);
    }
    
    public static int maxCutsCalc(int n , int a , int b , int c , int dp[]) {
        if(n<0) return Integer.MIN_VALUE;
        if(n == 0) return 0;
        
        if(dp[n]!=-1) return dp[n];
        
        int aCase = 1 + maxCutsCalc(n-a , a , b , c , dp);
        int bCase = 1 + maxCutsCalc(n-b , a , b , c , dp);
        int cCase = 1 + maxCutsCalc(n-c , a , b , c , dp);
        
        int maxCase = Math.max(aCase , Math.max(bCase , cCase));
        
        dp[n] = maxCase;
        
        return maxCase;
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