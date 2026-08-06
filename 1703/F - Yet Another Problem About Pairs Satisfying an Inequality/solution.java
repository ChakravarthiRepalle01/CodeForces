import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
 
public class Main {
    static int arr[] = new int[2*(int)Math.pow(10,5)+1];
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
        long totalCnt = 0;
 
        List<Integer> validIndices = new ArrayList<Integer>();
        List<Integer> validElements = new ArrayList<Integer>();
 
        for(int i = 1 ; i<=n ; i++) {
            int ele = in.nextInt();
            if(ele<i) {
                validIndices.add(i);
                validElements.add(ele);
            }
        }
 
        n = validIndices.size();
 
        for(int j = 0 ; j<n ; j++) {
            int ele = validElements.get(j);
            int pos = -1;
 
            int low = 0;
            int high = (n-1);
            int mid;
            int target = (ele-1);
 
            while(low<=high) {
                mid = low + (high-low)/2;
                if(validIndices.get(mid) <= target) {
                    pos = mid;
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
            totalCnt += (pos+1);
        }
        out.println(totalCnt);
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