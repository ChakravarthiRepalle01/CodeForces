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
        int x = in.nextInt();
        int y = in.nextInt();
 
      int gcd = calc_gcd(x,y);
      boolean isPoss = true;
      for(int i = 1 ; i<=n ; i++) {
        int ele = in.nextInt();
        if(i%gcd != ele%gcd) {
          isPoss = false;
        }
      }
      if(isPoss) {
        out.println("YES");
      }
      else {
        out.println("NO");
      }
    }
 
    public static int calc_gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return calc_gcd(y, x % y);
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