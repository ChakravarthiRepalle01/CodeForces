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
        int m = in.nextInt();
        
        if(m%n == 0) {
            int div = m/n;
            int totalCnt = 0;
            
            while(div%2 == 0) {
                totalCnt++;
                div /= 2;
            }
            
            while(div%3 == 0) {
                totalCnt++;
                div /= 3;
            }
            
            if(div == 1) {
                out.println(totalCnt);
            }
            else {
                out.println(-1);
            }
            
        }
        else {
            out.println(-1);
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