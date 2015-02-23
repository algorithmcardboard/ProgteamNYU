package in.rajegannathan.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/6/2015.
 */
public class AmrAndMusic {
    public static void main(String args[]) throws Exception{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String line = stdin.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int numInstruments, numDays;
        numInstruments = Integer.parseInt(st.nextToken());
        numDays = Integer.parseInt(st.nextToken());

        int[] daysRequired = new int[numDays];

        line= stdin.readLine();
        st = new StringTokenizer(line);

        for(int i = 0; i < numInstruments; i++){
            daysRequired[i] = Integer.parseInt(st.nextToken());
        }
    }
}
