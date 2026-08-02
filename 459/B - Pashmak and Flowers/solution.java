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
        long[] arr = new long[n];
        
        long minNum = Long.MAX_VALUE;
        long maxNum = Long.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
            if (arr[i] < minNum) minNum = arr[i];
            if (arr[i] > maxNum) maxNum = arr[i];
        }
        
        long minFreq = 0;
        long maxFreq = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == minNum) minFreq++;
            if (arr[i] == maxNum) maxFreq++;
        }
        
        long diff = maxNum - minNum;
        long ways = 0;
        
        if (minNum == maxNum) {
            ways = (long) n * (n - 1) / 2;
        } else {
            ways = minFreq * maxFreq;
        }
        
        out.println(diff + " " + ways);
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