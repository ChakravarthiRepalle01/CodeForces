import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
 
public class Main {
    static int arr[] = new int[2*(int)Math.pow(10,5)+1];
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
 
 
        int t = in.nextInt();
        while (t > 0) {
            solve(in, out);
            t--;
        }
 
        out.flush();
    }
 
    public static void solve(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
 
        String s = in.next();
 
        StringBuilder sb = new StringBuilder(s);
 
        int firstEven = -1;
        int firstOdd = -1;
 
        int i = 0;
        int j = 1;
 
        while(i<n) {
            if(s.charAt(i) != '?') {
                firstEven = i;
                break;
            }
            i += 2;
        }
 
        while(j<n) {
            if(s.charAt(j) != '?') {
                firstOdd = j;
                break;
            }
            j += 2;
        }
 
        if(firstEven!=-1) {
            i = (firstEven+2);
            char prev = s.charAt(firstEven);
            while(i<n) {
                char comp = (prev == '0') ? '1' : '0';
                if(s.charAt(i) == '?' || s.charAt(i) == comp) {
                    sb.setCharAt(i, (char)comp);
                }
                else {
                    out.println(0);
                    return;
                }
                i+=2;
                prev = comp;
            }
 
            prev = s.charAt(firstEven);
            i = (firstEven-2);
            while(i>=0) {
                char comp = (prev == '0') ? '1' : '0';
                if(s.charAt(i) == '?' || s.charAt(i) == comp) {
                    sb.setCharAt(i, comp);
                }
                else {
                    out.println(0);
                    return;
                }
                i-=2;
                prev = comp;
            }
        }
 
        
        if(firstOdd!=-1) {
            j = (firstOdd+2);
            char prev = s.charAt(firstOdd);
            while(j<n) {
                char comp = (prev == '0') ? '1' : '0';
                if(s.charAt(j) == '?' || s.charAt(j) == comp) {
                    sb.setCharAt(j, (char)comp);
                }
                else {
                    out.println(0);
                    return;
                }
                j+=2;
                prev = comp;
            }
 
            prev = s.charAt(firstOdd);
            j = (firstOdd-2);
            while(j>=0) {
                char comp = (prev == '0') ? '1' : '0';
                if(s.charAt(j) == '?' || s.charAt(j) == comp) {
                    sb.setCharAt(j, comp);
                }
                else {
                    out.println(0);
                    return;
                }
                j-=2;
                prev = comp;
            }
        }
 
        char ch1 = sb.charAt(0);
        char ch2 = sb.charAt(1);
 
        if (ch1 == '?' && ch2 == '?') {
            out.println(4);
        } else if (ch1 == '?' || ch2 == '?') {
            out.println(2);
        } else {
            out.println(1);
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