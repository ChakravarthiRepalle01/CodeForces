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
 
        int a[][] = new int[n][2];
        int b[][] = new int[n][2];
        int c[][] = new int[n][2];
 
        for(int i = 0 ; i<n ; i++) {
            a[i][0] = in.nextInt();
            a[i][1] = i;
        }
 
        for(int i = 0 ; i<n ; i++) {
            b[i][0] = in.nextInt();
            b[i][1] = i;
        }
 
        for(int i = 0 ; i<n ; i++) {
            c[i][0] = in.nextInt();
            c[i][1] = i;
        }
        
        Arrays.sort(a , (x,y) -> Integer.compare(y[0], x[0]));
        Arrays.sort(b , (x,y) -> Integer.compare(y[0], x[0]));
        Arrays.sort(c , (x,y) -> Integer.compare(y[0], x[0]));
 
        long maxFriends = 0;
 
        for(int i = 0 ; i<3 ; i++) {
            for(int j = 0 ; j<3 ; j++) {
                for(int k = 0 ; k<3 ; k++) {
                    if(a[i][1]!=b[j][1] && a[i][1]!=c[k][1] && b[j][1]!=c[k][1]) {
                        long sum = (long) (a[i][0] + b[j][0] + c[k][0]);
                        maxFriends = Math.max(maxFriends , sum);
                    }
                }
            }
        }
        out.println(maxFriends);
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