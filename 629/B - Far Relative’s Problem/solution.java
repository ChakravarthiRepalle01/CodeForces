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
        int n = in.nextInt();
 
        int M[] = new int[368];
        int F[] = new int[368];
 
        for(int i = 0 ; i <n ; i++) {
            char ch = in.next().charAt(0);
            int l = in.nextInt();
            int r = in.nextInt();
 
            if(ch == 'M') {
                M[l] += 1;
                M[r+1] += -1;
            }
            else {
                F[l] += 1;
                F[r+1] += -1;
            }
 
        }
 
        for(int i = 1 ; i<368 ; i++) {
            M[i] += M[i-1];
            F[i] += F[i-1];
        }
 
        int totalCnt = 0;
 
        for(int i = 1 ; i<=366 ; i++) {
            totalCnt = Math.max(totalCnt , 2*Math.min(M[i] , F[i]));
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