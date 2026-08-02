import java.io.*;
import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        
        // int t = 1;
        int t = in.nextInt();
        
        while(t > 0) {
            solve(in, out);
            t--;
        }
        out.flush(); 
    }
    
    public static void solve(FastReader in, PrintWriter out) {
        int n = in.nextInt();
        
        String s = in.next();
        
        int prefix[] = new int[n];
        prefix[0] = (int)(s.charAt(0)-'0');
        
        for(int i = 1 ; i<n ; i++) {
            prefix[i] = (prefix[i-1] + (int)(s.charAt(i)-'0'));
        }
        
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        long count = 0;
        map.put(0,1);
        for(int i = 0 ; i<n ; i++) {
            int modf = prefix[i] - (i+1);
            
            if(map.containsKey(modf)) {
                count += map.get(modf);
            }
            
            map.merge(modf , 1 , Integer::sum);
        }
        
        out.println(count);
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