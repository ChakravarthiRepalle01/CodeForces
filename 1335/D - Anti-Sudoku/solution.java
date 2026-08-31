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
        char sudoku[][] = new char[9][9];
 
        for(int i = 0 ; i<9 ; i++) {
            String line = in.next();
            for(int j = 0 ; j<9 ; j++) {
                sudoku[i][j] = line.charAt(j);
            }
        }
 
        int valid[][] = {{0 , 0} , {1 , 3} , {2 , 6} , {3 , 1} , {4 , 4} , {5 , 7} , {6 , 2} , {7 , 5} ,{8 , 8}};
 
        for(int []curr : valid) {
            int r = curr[0];
            int c = curr[1];
 
            if(sudoku[r][c] == '1') sudoku[r][c] = '2';
            else sudoku[r][c] = '1';
 
        }
 
        for(int i = 0 ; i<9 ; i++) {
            for(int j = 0 ; j<9 ; j++) {
                out.print(sudoku[i][j]);
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