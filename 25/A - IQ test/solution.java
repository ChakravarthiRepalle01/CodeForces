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
        
        int evenFreq = 0;
        int oddFreq = 0;
        int lastOddPos = -1;
        int lastEvenPos = -1;
        
        for(int i = 0 ; i<n ; i++) {
            int ele = in.nextInt();
            
            if(ele%2 == 0) {
                evenFreq++;
                lastEvenPos = (i+1);
            }
            else {
                oddFreq++;
                lastOddPos = (i+1);
            }
        }
        
        if(evenFreq > oddFreq) {
            out.println(lastOddPos);
        }
        else {
            out.println(lastEvenPos);
        }
        
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