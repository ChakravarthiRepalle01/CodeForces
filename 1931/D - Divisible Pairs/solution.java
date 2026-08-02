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
 
    record Pair(long remX , long remY) {}
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
        long x = in.nextLong();
        long y = in.nextLong();
 
        long a[] = new long[n];
        for(int i = 0 ; i<n ; i++) {
            a[i] = in.nextLong();
        }
 
        Map<Pair , Integer> freq = new HashMap<>();
        long totalPairs = 0;
 
        for(int j = 0 ; j<n ; j++) {
            long remX = a[j]%x;
            long remY = a[j]%y;
 
            long targetX = (x - remX)%x;
            long targetY = remY;
 
            Pair targetKey = new Pair(targetX, targetY);
            Pair currenKey = new Pair(remX, remY);
 
            if(freq.containsKey(targetKey)) totalPairs += freq.get(targetKey);
 
            freq.merge(currenKey , 1 , Integer::sum);
        }
 
        out.println(totalPairs);
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