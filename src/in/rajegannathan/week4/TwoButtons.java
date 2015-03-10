package in.rajegannathan.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 3/6/2015.
 * A and B and Team Training
 */
public class TwoButtons {
    static class FastIOReader {
        BufferedReader br;
        StringTokenizer st;

        public FastIOReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        void printArray(int[] arr, String name){
            System.out.print(name + " [");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println("]");
        }

    }

    public static void main(String[] args){
        FastIOReader reader = new FastIOReader();
        int n = reader.nextInt();
        int m = reader.nextInt();

        int steps = 0;
        steps += getSteps(n,m, steps, n, m);
        System.out.println(steps);
    }

    private static int getSteps(int n, int m, int steps, final int orign, final int origm) {
        if(steps != 0 && n == orign){
            return Integer.MAX_VALUE/2;
        }
        System.out.println("called with "+n+" "+m);
        if(n>m){
            System.out.println("returning "+(n-m));
            return n-m;
        }else if(n == m){
            System.out.println("returning "+0);
            return 0;
        }
        int dSteps = 0, lessSteps = 0;
//        if(){
            dSteps = getSteps(n*2, m, steps, orign, origm);
//        }
        if(n > origm/2){
            lessSteps = getSteps(n-1, m, steps, orign, origm);
        }else{
            lessSteps = dSteps;
        }
        return steps + Math.min(dSteps, lessSteps)+1;
    }
}
