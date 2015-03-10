package in.rajegannathan.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/27/2015.
 * Drazil and Date
 */
public class DrazilAndDate {
    static class FastIOReader {
        BufferedReader br;
        StringTokenizer st;

        public FastIOReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
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

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

    public static void main(String[] args){
        FastIOReader reader = new FastIOReader();
        int a = reader.nextInt();
        int b = reader.nextInt();
        int s = reader.nextInt();

        int remaining = s - (Math.abs(a)+Math.abs(b));
        if(s >= 0 && remaining >= 0 && remaining%2 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
