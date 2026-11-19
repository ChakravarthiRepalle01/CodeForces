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
        // t = in.nextInt();
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        String a = in.next();
        String b = in.next();
        String c = in.next();
 
        int freq[] = new int[26];
 
        for(int i = 0 ; i<a.length() ; i++) {
            int idx = (int)(a.charAt(i) - 'A');
            freq[idx]++;
        }
        for(int i = 0 ; i<b.length() ; i++) {
            int idx = (int)(b.charAt(i) - 'A');
            freq[idx]++;
        }
        for(int i = 0 ; i<c.length() ; i++) {
            int idx = (int)(c.charAt(i) - 'A');
            freq[idx]--;
        }
 
        for(int i = 0 ; i<26 ; i++) {
            if(freq[i] != 0) {
                out.println("NO");
                return;
            }
        }
        out.println("YES");
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