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
 
        int a[] = new int[n];
        int b[] = new int[n];
 
        for(int i = 0 ; i<n ; i++) {
            a[i] = in.nextInt();
        }
 
        for(int i = 0 ; i<n ; i++) {
            b[i] = in.nextInt();
        }
 
        HashSet<Integer> set = new HashSet<>();
 
        int i = (n-1);
        int j = (n-1);
 
        while(i>=0 && j>=0) {
            if(!set.contains(b[j])) {
                if(a[i] == b[j]) {
                    i--;
                    j--;
                }
                else {
                    set.add(a[i]);
                    i--;
                }
            }
            else {
                j--;
            }
        }
 
        out.println(set.size());
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