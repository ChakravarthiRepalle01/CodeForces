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
 
        long topPrefix[] = new long[n];
        long downPrefix[] = new long[n];
 
        for(int i = 0 ; i<n ; i++) {
            long ele = in.nextLong();
            topPrefix[i] = ele;
            if(i>0) topPrefix[i] += topPrefix[i-1];
        }
 
        for(int i = 0 ; i<n ; i++) {
            long ele = in.nextLong();
            downPrefix[i] = ele;
            if(i>0) downPrefix[i] += downPrefix[i-1];
        }
 
        long minScore = Long.MAX_VALUE;
 
        for(int j = 0 ; j<n ; j++) {
            long caseLeft = (j>0) ? downPrefix[j-1] : 0;
            long caseRight = (j<(n-1)) ? topPrefix[n-1] - topPrefix[j] : 0;
            minScore = Math.min(minScore , Math.max(caseLeft , caseRight));
        }
 
        out.println(minScore);
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