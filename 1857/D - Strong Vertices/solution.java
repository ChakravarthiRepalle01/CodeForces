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
        int n = in.nextInt();
 
        int a[] = new int[n];
        int b[] = new int[n];
 
        for(int i = 0 ; i<n ; i++) a[i] = in.nextInt();
        for(int i = 0 ; i<n ; i++) b[i] = in.nextInt();
 
        int result[][] = new int[n][2];
 
        for(int i = 0 ; i<n ; i++) {
            result[i][0] = (i+1);
            result[i][1] = (a[i] - b[i]);
        } 
 
        Arrays.sort(result , (x , y) -> {
            if(x[1] == y[1]) return Integer.compare(x[0] , y[0]);
            else return Integer.compare(y[1] , x[1]);
        });
 
        int totalCnt = 1;
        int prevWeight = result[0][1];
 
        for(int i = 1 ; i<n ; i++) {
            if(result[i][1] == prevWeight) totalCnt++;
            else break;
        }
 
        out.println(totalCnt);
        for(int i = 0 ; i<totalCnt ; i++) {
            out.print(result[i][0] + " ");
        }
        out.println();
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