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
        String s = in.next();
 
        int i = 0;
        int maxLength = 0 ;
        int len = 0;
 
        while(i<n) {
          if(s.charAt(i) == '*') {
            maxLength = Math.max(maxLength , len);
            len = 0;
          }
          else {
            len++;
          }
          i++;
        }
        maxLength = Math.max(maxLength , len);
 
        out.println((maxLength+1)/2);
 
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