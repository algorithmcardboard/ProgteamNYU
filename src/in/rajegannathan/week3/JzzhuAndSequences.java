package in.rajegannathan.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/21/2015.
 * Jzzhu and Sequences
 */
public class JzzhuAndSequences {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        line = stdin.readLine();
        st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());

        int[] series = {x, y, y-x,-1*x, -1*y, x-y};

        int position = (n-1+6) % 6;
        int value = series[position];
        if(value >=0){
            System.out.println((long)(value % (1e9+7)));
        }else {
            System.out.println((long)((value + (2*1000000007)) % 1000000007));
        }
    }
}