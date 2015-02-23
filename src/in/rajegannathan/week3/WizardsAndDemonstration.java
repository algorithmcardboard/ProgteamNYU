package in.rajegannathan.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/20/2015.
 */
public class WizardsAndDemonstration {
    public static void main(String []args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        StringTokenizer st = new StringTokenizer(line);

        double n = Integer.parseInt(st.nextToken());
        double x = Integer.parseInt(st.nextToken());
        double y = Integer.parseInt(st.nextToken());
        double k = ((y * n / 100) - x);
        if(k < 0.0d) {
            k = 0.0d;
        }
        System.out.println((int)Math.ceil(k));
    }
}
