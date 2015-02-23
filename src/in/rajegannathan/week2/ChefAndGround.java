package in.rajegannathan.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/13/2015.
 */
public class ChefAndGround {
    public static void main(String args[]) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int testCases = Integer.parseInt(st.nextToken());
        for(; testCases > 0; testCases--){
            line = stdin.readLine();
            st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] cols = new int[n];

            line = stdin.readLine();
            st = new StringTokenizer(line);
            for(int i =0; i < n; i++){
                cols[i] = Integer.parseInt(st.nextToken());
            }

            //find largest
            int largest = 0;
            for(int i = 0; i < n; i++){
                if(cols[i] > largest){
                    largest = cols[i];
                }
            }

            boolean possible = true;
            for(int i =0; i < n; i++){
                m = m - (largest - cols[i]);
                if(m < 0){
                    possible = false;
                    break;
                }
            }
            if(m > 0 && m%n != 0){
                possible = false;
            }
            if(possible){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}