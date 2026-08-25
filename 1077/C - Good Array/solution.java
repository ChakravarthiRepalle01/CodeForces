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
        // t = in.nextInt();
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
 
        HashMap<Long , Long> map = new HashMap<Long , Long>();
        int totalCnt = 0;
        long totalSum = 0;
 
        long arr[] = new long[n];
        ArrayList<Integer> ans = new ArrayList<>();
 
        for(int i = 0 ; i<n ; i++) {
            arr[i] = in.nextLong();
            map.merge(arr[i] , 1L , Long::sum);
            totalSum += arr[i];
        }
 
        for(int i = 0 ; i<n ; i++) {
            map.merge(arr[i] , -1L , Long::sum);
            totalSum -= arr[i];
            long reqSum = totalSum/2;
            if(totalSum%2 == 0 && map.containsKey(reqSum) && map.get(reqSum)>0) {
                totalCnt++;
                ans.add(i+1);
            }
            totalSum += arr[i];
            map.merge(arr[i] , 1L , Long::sum);
        }
 
        out.println(totalCnt);
 
        for(int i = 0 ; i<totalCnt ; i++) {
            out.print(ans.get(i) + " ");
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