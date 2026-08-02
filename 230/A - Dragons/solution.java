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
        long s = in.nextLong();
        int n = in.nextInt();
        
        int arr[][] = new int[n][2];
        
        for(int i = 0 ; i<n ; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        
        Arrays.sort(arr , (a,b) -> {
                if(a[0] != b[0]) {
                    return Integer.compare(a[0] , b[0]);
                }
                else {
                    return Integer.compare(b[1] , a[1]);
                }
            });
            
        
        for(int i = 0 ; i<n ; i++) {
            if(s > arr[i][0]) {
                s += arr[i][1];
            }
            else {
                out.println("NO");
                return;
            }
        }
        out.println("YES");
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