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
        int m = in.nextInt();
 
        int modVal[] = new int[m];
 
        for(int i = 0 ; i<n ; i++) {
            int ele = in.nextInt();
            modVal[ele%m]++;
        }
 
        int totalCnt = 0;
 
        for(int i = 0 ; i<=m/2 ; i++) {
            if(i == 0) {
                if(modVal[i] > 0) totalCnt++;
            }
            else if(m%2 == 0 && i == m/2) {
                if(modVal[i] > 0) totalCnt++;
            }
            else {
                int currMod = i;
                int reqMod = (m-i);
                int minVal = Math.min(modVal[currMod] , modVal[reqMod]);
 
                if(minVal > 0) {
                    modVal[currMod] -= minVal;
                    modVal[reqMod] -= minVal;
                    totalCnt++;
 
                    if(modVal[currMod] > 0) modVal[currMod]--;
                    else if(modVal[reqMod] > 0) modVal[reqMod]--;
 
                    totalCnt += modVal[currMod] + modVal[reqMod];
                    modVal[currMod] = 0;
                    modVal[reqMod] = 0;
                }
                else {
                    totalCnt += modVal[currMod] + modVal[reqMod];
                    modVal[currMod] = 0;
                    modVal[reqMod] = 0;
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