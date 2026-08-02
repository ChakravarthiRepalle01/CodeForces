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
        
        int arr[] = new int[n];
        int sortedArray[] = new int[n];
        
        for(int i = 0 ; i<n ; i++) {
            arr[i] = in.nextInt();
            sortedArray[i] = arr[i];
        }
        
        Arrays.sort(sortedArray);
        
        int i = 0 ;
        int j = (n-1);
        
        while(i<n && arr[i] == sortedArray[i]) i++;
        
        while(j>=0 && arr[j] == sortedArray[j]) j--;
        
        int l = i;
        int r = j;
        
        if(l>=r) { // arr is already sorted and i can reverse a single segment
            out.println("yes");
            out.println(1 + " " + 1);
            return;
        }
        
        while(l<r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        
        l = i;
        r = j;
        
        while(l<=r) {
            if(arr[l] != sortedArray[l]) {
                out.println("no");
                return;
            }
            l++;
        }
        
        out.println("yes");
        out.println((i+1) + " " + (j+1));
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