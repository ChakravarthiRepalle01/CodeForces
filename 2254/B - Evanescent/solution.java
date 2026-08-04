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
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
        String s = in.next();
 
        int deleteIdx = 1;
 
        for(int i = 1 ; i<(n-1) ; i++) {
            if(s.charAt(i-1) == s.charAt(i+1) && s.charAt(i) != s.charAt(i-1)) {
                deleteIdx = i;
                break;
            }
            if(s.charAt(i)!=s.charAt(i-1) && s.charAt(i-1)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i+1)) {
                deleteIdx = i;
            }
        }
        
        int totalLength = 1;
        int prevIdx = 0;
 
        for(int i = 1 ; i<n ; i++) {
            if(i == deleteIdx) continue;
            if(s.charAt(i) != s.charAt(prevIdx)) {
                totalLength++;
                prevIdx = i;
            }
        }
 
        out.println(totalLength);
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