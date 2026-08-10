import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
 
 
        // int t = in.nextInt();
        int t = 1;
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n1 = in.nextInt();
        int n2 = in.nextInt();
 
        int a[] = new int[n1];
        int b[] = new int[n2];
 
        for(int i = 0 ; i<n1 ; i++) a[i] = in.nextInt();
 
        for(int j = 0 ; j<n2 ; j++) b[j] = in.nextInt();
 
        Arrays.sort(a);
 
        for(int j = 0 ; j<n2 ; j++) {
            int target = b[j];
 
            int low = 0;
            int high = (n1-1);
            int mid;
 
            while(low<=high) {
                mid = low + (high-low)/2;
                if(a[mid]<=target) {
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
            out.print((high+1)+" ");
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