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
 
        int arr[] = new int[n];
 
        int noOfZeros = 0;
 
        for(int i = 0 ; i<n ; i++) {
            arr[i] = in.nextInt();
            if(arr[i] == 0) noOfZeros++;
        }
 
        if(noOfZeros == 0) {
            out.println("YES");
            for(int i = 0 ; i<n ; i++) {
                out.print("A");
            }
            out.println();
        }
        else if(noOfZeros == 1) {
            out.println("NO");
        }   
        else {
            out.println("YES");
            boolean coverB = false;
            for(int i = 0 ; i< n ;i++) {
                if(arr[i] != 0) {
                    out.print("A");
                }
                else {
                    if(coverB) {
                        out.print("C");
                    }
                    else { 
                        out.print("B");
                        coverB = true;
                    }
                }
            }
            out.println();
        }
 
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