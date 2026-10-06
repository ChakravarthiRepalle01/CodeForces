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
 
        int nums[] = new int[n];
 
        for(int i = 0 ; i<n ; i++) {
            nums[i] = in.nextInt();
        }
 
        int negativeIdx1 = -1;
        int negativeIdx2 = -1;
        int negativeIdx3 = -1;
        int positiveIdx = -1;
 
        for(int i = 0 ; i<n ; i++) {
            if(nums[i] < 0) {
                if(negativeIdx1 == -1) {
                    negativeIdx1 = i;
                }
                else if(negativeIdx2 == -1) {
                    negativeIdx2 = i;
                }
                else if(negativeIdx3 == -1) {
                    negativeIdx3 = i;
                }
            }
            else if(nums[i] > 0) {
                positiveIdx = i;
            }
        }
 
        out.println(1 + " " + nums[negativeIdx1]);
        
        if(positiveIdx == -1) {
            out.println(2 + " " + nums[negativeIdx2] + " " + nums[negativeIdx3]);
        }
        else {
            out.println(1 + " " + nums[positiveIdx]);
        }
 
        if(positiveIdx != -1) {
            out.print((n-2) + " ");
        }
        else {
            out.print((n-3) + " ");
        }
 
        for(int i = 0 ; i<n ; i++) {
            if(positiveIdx != -1){
                if(i!= positiveIdx && i!=negativeIdx1) {
                    out.print(nums[i] + " ");
                }
            }
            else {
                if(i!=negativeIdx1 && i!=negativeIdx2 && i!=negativeIdx3) {
                    out.print(nums[i] + " ");
                }
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