package in.rajegannathan.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/21/2015.
 */
public class FunWithRotation {
    /*
    Fun with Rotation
    http://acm.hust.edu.cn/vjudge/contest/view.action?cid=70305#problem/C
     */
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        line = stdin.readLine();
        st = new StringTokenizer(line);

        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int startPosition = 0;
        while(M > 0){
            line = stdin.readLine();
            st = new StringTokenizer(line);
            String query = st.nextToken();
            int dUnit = Integer.parseInt(st.nextToken());
            if(query.equals("C")){
                startPosition = (startPosition + dUnit)%N;
            }else if(query.equals("A")){
                startPosition = (startPosition - dUnit+N)%N;
            }else if(query.equals("R")){
                int indexToPrint = (startPosition + dUnit -1)%N;
                System.out.println(A[indexToPrint]);
            }
            M--;
        }
    }
}
