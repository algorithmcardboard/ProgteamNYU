package in.rajegannathan.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/13/2015.
 */
public class FoxAndSnake {
    public static void main(String args[]) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean fullSnake = true;
        boolean hashAtFirst = false;

        for(int i=0; i < n; i++){
            if(i%2 == 0){
                for(int j =0; j < m; j++){
                    System.out.print('#');
                }
                System.out.println();
            }else{
                if(hashAtFirst){
                    System.out.print('#');
                    for(int j =0; j < m-1; j++){
                        System.out.print('.');
                    }

                }else{
                    for(int j =0; j < m-1; j++){
                        System.out.print('.');
                    }
                    System.out.print('#');
                }
                System.out.println();
                hashAtFirst = !hashAtFirst;
            }
        }
    }
}
