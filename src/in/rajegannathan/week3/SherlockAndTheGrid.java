package in.rajegannathan.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/21/2015.
 * Sherlock and the Grid
 */
public class SherlockAndTheGrid {
    public static final int TRANSPARENT = 1;
    public static final int BLOCKY = 2;
    public static final int BLOCKX = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int T = Integer.parseInt(st.nextToken());
        while (T > 0) {
            line = stdin.readLine();
            st = new StringTokenizer(line);
            int N = Integer.parseInt(st.nextToken());
            int[][] Blockers = new int[N][N];

            for(int i = 0; i < N; i++) {
                line = stdin.readLine();
                for(int j = 0; j< line.length(); j++){
                    if(line.charAt(j) == '#'){
                        Blockers[i][j] = BLOCKX*BLOCKY;
                    }else{
                        Blockers[i][j] = TRANSPARENT;
                    }
                }
            }

            int rowNum = N;
            int n2 = N*N;
            int numLocations = 0, curVal;
            for(int i = n2 - 1; i >=0; i--){
                int bottom, right, value = TRANSPARENT;
                int j = i%N;
                if(j == N-1){
                    right = TRANSPARENT;
                }else{
                    right = Blockers[rowNum - 1][j+1];
                }
                if(rowNum == N){
                    bottom = TRANSPARENT;
                }else{
                    bottom = Blockers[rowNum][j];
                }
                curVal = Blockers[rowNum-1][j];
                if((bottom % BLOCKY) == 0 ){
                    value = value * BLOCKY;
                }
                if((right % BLOCKX) == 0){
                    value = value * BLOCKX;
                }
                if(curVal == TRANSPARENT){
                    if(value == TRANSPARENT){
                        numLocations++;
                    }
                    Blockers[rowNum-1][j] = value;
                }else{
                    value = curVal;
                }
//                System.out.print("[" + (rowNum - 1) + "][" + j + "]=" + value+" "+ Blockers[rowNum-1][j]+ " ");
                if(j == 0){
                    rowNum--;
                }
            }
//            System.out.println();
            System.out.println(numLocations);

            T--;
        }
    }
}