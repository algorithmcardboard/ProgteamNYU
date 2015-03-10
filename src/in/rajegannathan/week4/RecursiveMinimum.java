package in.rajegannathan.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 3/6/2015.
 */
public class RecursiveMinimum {
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
        int[] A = new int[4];
        A[0] = reader.nextInt();
        A[1] = reader.nextInt();
        A[2] = reader.nextInt();
        A[3] = reader.nextInt();

        int result = 0;
        result = Math.max(result, canConstructTriangle(A[0], A[1], A[2]));
        result = Math.max(result, canConstructTriangle(A[1], A[2], A[3]));
        result = Math.max(result, canConstructTriangle(A[2], A[3], A[0]));
        result = Math.max(result, canConstructTriangle(A[3], A[0], A[1]));

        if(result == 2){
            System.out.println("TRIANGLE");
        }else if(result == 1){
            System.out.println("SEGMENT");
        }else{
            System.out.println("IMPOSSIBLE");
        }
    }

    private static int canConstructTriangle(int a, int b, int c) {
        if(a+b > c && b+c > a && c+a > b) {
            return 2;
        }else if(a+b == c || b+c == a || c+a ==b){
            return 1;
        }
        return 0;
    }
}
