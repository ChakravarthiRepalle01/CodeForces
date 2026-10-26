// _________ .__            __                                       __  .__    .__ 
// \_   ___ \|  |__ _____  |  | ______________ ___  _______ ________/  |_|  |__ |__|
// /    \  \/|  |  \\__  \ |  |/ /\_  __ \__  \\  \/ /\__  \\_  __ \   __\  |  \|  |
// \     \___|   Y  \/ __ \|    <  |  | \// __ \\   /  / __ \|  | \/|  | |   Y  \  |
//  \______  /___|  (____  /__|_ \ |__|  (____  /\_/  (____  /__|   |__| |___|  /__|
//         \/     \/     \/     \/            \/           \/                 \/    
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
        t = in.nextInt();
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
 
        long nums[] = new long[n];
 
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextLong();
        }
 
        long suffixSum[] = new long[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i];
        }
 
        long maxSuffix[] = new long[n + 1];
        maxSuffix[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            maxSuffix[i] = Math.max(maxSuffix[i + 1], nums[i]);
        }
 
        long maxPrefix[] = new long[n];
        maxPrefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            maxPrefix[i] = Math.max(maxPrefix[i - 1], nums[i]);
        }
        
        for (int k = 1; k <= n; k++) {
            long currentMax = suffixSum[n - k];
            
            if (n - k - 1 >= 0) {
                currentMax = Math.max(currentMax, suffixSum[n - k + 1] + maxPrefix[n - k - 1]);
            }
            
            out.print(currentMax + " ");
        }
        out.println();
    }
    
    public static long getGcd(long a , long b) {
        if(b == 0) return a;
        return getGcd(b, a%b);
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