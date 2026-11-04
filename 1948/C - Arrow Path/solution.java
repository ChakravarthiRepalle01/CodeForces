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
 
        char grid[][] = new char[2][n];
 
        for(int i = 0 ; i<2 ; i++) {
            String s = in.next();
            for(int j = 0 ; j<n ; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
 
        boolean visited[][] = new boolean[2][n];
        Queue<int[]> q = new LinkedList<>();
 
        q.add(new int[]{0 , 0});
        visited[0][0] = true;
 
        int dr[] = {-1 , 1 , 0 , 0};
        int dc[] = {0 , 0 , -1 , 1};
 
        boolean reachable = false;
 
        while(!q.isEmpty()) {
            int curr[] = q.poll();
            int r = curr[0];
            int c = curr[1];
 
            if(r == 1 &&  c == (n-1)) {
                reachable = true;
                break;
            }
 
            for(int i = 0 ; i<4 ; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
 
                if(nr>=0 && nr<2 && nc>=0 && nc<n) {
                    char arr = grid[nr][nc];
                    int nnr = nr;
                    int nnc = nc;
 
                    if(arr == '<') {
                        nnc--;
                    }
                    else {
                        nnc++;
                    }
 
                    if(!visited[nnr][nnc]) {
                        visited[nnr][nnc] = true;
                        q.add(new int[]{nnr , nnc});
                    }
 
                }
 
            }
 
        }
 
        if(reachable) {
            out.println("YES");
        }
        else {
            out.println("NO");
        }
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