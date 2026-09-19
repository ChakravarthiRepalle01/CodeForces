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
 
        int nums[][] = new int[n][n];
 
        for(int i = 0 ; i < n ; i++) {
            String row = in.next();
            for(int j = 0 ; j < n ; j++) {
                nums[i][j] = row.charAt(j) - '0';
            }
        }
 
        int newNums[][] = new int[n][n];
 
        for(int i = 0 ; i<n ; i++) {
            for(int j = 0 ; j<n ; j++) {
                newNums[i][j] = nums[i][j] + nums[j][n-1-i] + nums[n-1-i][n-1-j] + nums[n-1-j][i];
            }
        }
 
        int totalCnt = 0;
 
        for(int i = 0 ; i<n ; i++) {
            for(int j = 0 ; j<n ; j++) {
                if(!(newNums[i][j] == 0 || newNums[i][j] == 4)) {
                    totalCnt += Math.min(4-newNums[i][j] , newNums[i][j]);
                }
            }
        }
 
        out.println(totalCnt/4);
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