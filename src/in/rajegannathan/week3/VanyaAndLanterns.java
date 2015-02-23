package in.rajegannathan.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/20/2015.
 */
public class VanyaAndLanterns {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] lanterns = new int[n];

        line = stdin.readLine();
        st = new StringTokenizer(line);

        for(int i =0; i < n; i++){
            lanterns[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lanterns);

        int firstStretch = lanterns[0] - 0;
        int lastStretch = l - lanterns[lanterns.length - 1];

        double curD = 0, maxD = 0;
        for(int i =0; i < lanterns.length - 1; i++) {
            curD = ((double)(lanterns[i+1] - lanterns[i]))/2;
            if(curD > maxD){
                maxD = curD;
            }
        }

        System.out.println(Math.max(Math.max(firstStretch, lastStretch), maxD));
    }
}


