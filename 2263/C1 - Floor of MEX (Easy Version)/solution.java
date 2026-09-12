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
 
        int nums[] = new int[n];
 
        for(int i = 0 ; i<n ; i++) {
            nums[i] = in.nextInt();
        }
 
        int diff[] = new int[n+1];
 
        for(int i = 0 ; i<n ; i++) {
            long k = i+1;
            long minRange = nums[i]*k;
            long maxRange = minRange+k;
 
            if(minRange>=0 && minRange < n) diff[(int)minRange] += 1;
            if(maxRange>=0 && maxRange < n) diff[(int)maxRange] += -1;
        }
 
        for(int i = 1 ; i<n ; i++) {
            diff[i] += diff[i-1];
        }
 
        int size = 0;
        for(int i = 0 ; i<n ; i++) {
            if(diff[i] == 0) {
                size++;
            }
        }
 
        out.println(size);
        for(int i = 0 ; i<n ; i++) {
            if(diff[i] == 0) {
                out.print(i+ " ");
            }
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