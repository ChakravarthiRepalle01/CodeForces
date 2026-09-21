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
 
        String s = in.next();
        int totalCnt = 0;
 
        if(s.charAt(0) == '1') {
            for(int i = 1 ; i<n ; i++) {
                if(s.charAt(i) == '0') totalCnt++;
            }
        }
        else {
            int i = 1;
            for(i = 1 ; i<n ; i++) {
                if(s.charAt(i) == '1') break;
            }
 
            int j = (n-1);
            for(j = (n-1) ; j>=0 ; j--) {
                if(s.charAt(j) == '0') break;
            }
 
            if(i<j) {
                int cnt = 0;
 
                for(int k = i ; k<=j ; k++) {
                    if(s.charAt(k) == '0') cnt++;
                }
 
                totalCnt = cnt;
 
                for(int k = i ; k<=j ; k++) {
                    if(s.charAt(k) == '1') cnt++;
                    else cnt--;
                    totalCnt = Math.min(totalCnt , cnt);
                }
            }
 
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