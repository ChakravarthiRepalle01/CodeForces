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
        String s = in.next();
 
        StringBuilder sb = new StringBuilder(s);
 
        int n = sb.length();
 
        for(int i = 1 ; i<(n-1) ; i++) {
            if(sb.charAt(i) == sb.charAt(i-1)) {
                if(sb.charAt(i-1) != 'z' && sb.charAt(i+1) != 'z') {
                    sb.setCharAt(i, 'z');                    
                }
                else if(sb.charAt(i-1)!='y' && sb.charAt(i+1) != 'y') {
                    sb.setCharAt(i, 'y');
                }
                else {
                    sb.setCharAt(i, 'x');
                }
            }
        }
 
        if(n>1 && sb.charAt(n-2) == sb.charAt(n-1)) {
            if(sb.charAt(n-2) != 'z') {
                sb.setCharAt(n-1, 'z');
            }
            else {
                sb.setCharAt(n-1 , 'y');
            }
        }
 
        out.println(sb.toString());
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