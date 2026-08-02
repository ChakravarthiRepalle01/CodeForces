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
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
 
        for(int i = 0 ; i<n ; i++) {
            int ele = in.nextInt();
            primeFactorization(ele , map);
        }
 
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue()%n!=0) {
                out.println("NO");
                return;
            }
        }
 
        out.println("YES");
    }
 
    public static void primeFactorization(int ele , HashMap<Integer , Integer> map) {
        for(int i = 2 ; i*i<=ele ; i++) {
            while(ele%i == 0) {
                map.merge(i,1,Integer::sum);
                ele /= i;
            }
        }
        if(ele>1) map.merge(ele , 1 , Integer::sum);
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