package in.rajegannathan.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/13/2015.
 */
public class RegistrationSystem {
    public static void main(String args[]) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int numTests = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> nameToCount = new HashMap<String, Integer>();

        for(;numTests>0;numTests--){
            line = stdin.readLine();
            line = line.trim();
            if(!nameToCount.containsKey(line)){
                nameToCount.put(line, 0);
                System.out.println("OK");
            }else{
                int count = nameToCount.get(line) +1;
                nameToCount.put(line, count);
                System.out.println(line+count);
            }
        }
    }
}
