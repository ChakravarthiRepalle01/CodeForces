import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
 
 
        // int t = in.nextInt();
        int t = 1;
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        String s = in.next();
        int n = s.length();
 
        int freq[] = new int[26];
        boolean isFirst = true;
        boolean wonFirst = false;
 
        for(int i = 0 ; i<n ; i++) {
            freq[(int)(s.charAt(i)-'a')]++;
        }
 
        while(true) {
            int noOfEven = 0;
            int noOfOdd = 0;
            for(int i = 0 ; i<26 ; i++) {
                if(freq[i] > 0) {
                    if(freq[i]%2 == 0) noOfEven++;
                    else noOfOdd++;
                }
            }
 
            if(noOfOdd<=1) {
                if(isFirst) {
                    wonFirst = true;
                    break;
                }
                else {
                    wonFirst = false;
                    break;
                }
            }
            else {
                for(int i = 0 ; i<26 ; i++) {
                    if(freq[i]%2 == 0) {
                        if(noOfEven>0 && freq[i]>0) {
                            freq[i]--;
                            break;
                        }
                    }
                    else {
                        if(noOfEven <= 0) {
                            freq[i]--;
                            break;
                        }
                    }
                }
            }
            isFirst = !isFirst;
        }
 
        if(wonFirst) {
            out.println("First");
        }
        else {
            out.println("Second");
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