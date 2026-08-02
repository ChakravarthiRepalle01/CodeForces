import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        
        int t = in.nextInt();
        
        while(t > 0) {
            solve(in, out);
            t--;
        }
        out.flush(); 
    }
    
    public static void solve(FastReader in, PrintWriter out) {
        
        int n = in.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0 ; i<n ; i++) {
            arr[i] = in.nextInt();
        }
        
        int leftSum = 0;
        int rightSum = 0;
        int i = 0 , j = (n-1);
        int maxLength = 0;
        
        while (i <= j) {
            if (leftSum == rightSum) {
                maxLength = i + (n - 1 - j);
            }
            
            if (leftSum <= rightSum) {
                leftSum += arr[i++];
            } else {
                rightSum += arr[j--];
            }
        }
        if (leftSum == rightSum) {
            maxLength = i + (n - 1 - j);
        }
        out.println(maxLength);
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