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
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        
        if(x1 == x2) {
            int side = Math.abs(y2-y1);
            out.println((x1+side) + " " + y1 + " " + (x2+side) + " " + y2);
        }
        else if(y1 == y2) {
            int side = Math.abs(x2-x1);
            out.println(x1 + " " + (y1+side) + " " + x2 + " " + (y2+side));            
        }
        else if(Math.abs(x2-x1) == Math.abs(y2-y1)) {
            out.println(x1 + " " + y2 + " " + x2 + " " + y1);
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