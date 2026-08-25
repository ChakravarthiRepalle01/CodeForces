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
        t = in.nextInt();
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        long n = in.nextLong();
        long x = in.nextLong();
        long y = in.nextLong();
 
        long noOfAllx = n/x;
        long noOfAlly = n/y;
        long noOfxAndy = n/lcm(x,y);
 
        long noOfOnlyx = noOfAllx - noOfxAndy;
        long noOfOnlyy = noOfAlly - noOfxAndy;
 
        long totaly = (noOfOnlyy*(noOfOnlyy+1))/2;
        long totalx = n*noOfOnlyx - (noOfOnlyx*(noOfOnlyx-1))/2;
 
        out.println(totalx - totaly);
    }
 
    public static long lcm(long a , long b) {
        return (a*b)/gcd(a,b);
    }
 
    public static long gcd(long a , long b) {
        if(b == 0) return a;
        return gcd(b , a%b);
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