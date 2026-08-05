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
        List<List<Integer>> input = new ArrayList<>();
        boolean isYes = false;
 
        for(int i = 0 ; i<n ; i++) {
            input.add(new ArrayList<>());
            int k = in.nextInt();
            input.get(i).add(k);
            for(int j = 0 ; j<k ; j++) {
                int idx = in.nextInt();
                arr[idx]++;
                input.get(i).add(idx);
            }
        }
 
        for(int i = 0 ; i<n ; i++) {
            int k = input.get(i).get(0);
            boolean isValid = true;
            for(int j = 0 ; j<k ; j++) {
                int idx = input.get(i).get(j+1);
                if((arr[idx]-1) <= 0) {
                    isValid = false;
                    break;
                }
            }
            if(isValid) {
                isYes = true;
                break;
            }
        }
 
        
        out.println((isYes) ? "YES" : "NO");
 
        for(int i = 0 ; i<n ; i++) {
            int k = input.get(i).get(0);
            for(int j = 0 ; j<k ; j++) {
                int idx = input.get(i).get(j+1);
                arr[idx] = 0;
            }
        }
 
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