package in.rajegannathan.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/13/2015.
 */
public class MaximumAbsurdity {
    public static void main (String[] args) throws  Exception{

        int test = 547468;
        System.out.println(test);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] laws = new int[n];
        int[] cumulative = new int[n];

        line = stdin.readLine();
        st = new StringTokenizer(line);
        int cum = 0;

        for(int i =0; i < n; i++){
            laws[i] = Integer.parseInt(st.nextToken());
            cum = cum + laws[i];
            cumulative[i] = cum;
        }

        /*for(int i =0; i < cumulative.length; i++){
            System.out.print(cumulative[i] + " ");
        }
        System.out.println();
        System.out.println(a + " "+ b);*/

        int currentASum, currentBSum, maxB=k-1, maxA =0;
        int a = 0, b = k;
        int maxASum = 0;
        int maxBSum = 0;

        for(int i =0; i < n-k-1; i++){
            currentASum = cumulative[i+k-1] - (i==0?0:cumulative[i-1]);
            if(currentASum > maxASum){
                maxASum = currentASum;
                maxA = i;
            }
        }

        for(int i = maxA + k; i <= n-k; i++){
            currentBSum = cumulative[i+k-1] - (i==0?0:cumulative[i-1]);
            if(currentBSum > maxBSum){
                maxBSum = currentBSum;
                maxB = i;
            }
        }

//        for(int i =0; i <= (n-2*k); i++){
//            a = i; b = a+k;
//            currentASum = cumulative[a + k - 1] - (a==0?0:cumulative[a-1]);
//            currentBSum = cumulative[b + k - 1] - (b==0?0:cumulative[b-1]);
//            if(currentASum > maxASum){
//                maxASum = currentASum;
//                maxA = a;
//            }
//            if(currentBSum > maxBSum){
//                maxBSum = currentBSum;
//                maxB = b;
//            }
//        }
//        System.out.println(maxASum + " " + maxBSum);
        System.out.println((maxA+1) + " " + (maxB+1));
    }
}
