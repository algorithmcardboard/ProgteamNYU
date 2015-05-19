import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 3/7/2015.
 */
public class AggressiveCows {
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        void printArray(int[] arr, String name) {
            System.out.print(name + " [");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");
        }

    }

    public static void main(String[] args) {
        FastIOReader reader = new FastIOReader();

        int testCases = reader.nextInt();
        while(testCases-- > 0){
            int N = reader.nextInt();
            int C = reader.nextInt();

            int factor = N/C + ((N-C)%C>0?1:0);
            if(C == 2){
                factor = N-1;
            }

            int[] stalls = new int[N];

            for(int i = 0; i < N; i++){
                stalls[i] = reader.nextInt();
            }

            Arrays.sort(stalls);

            int min = N;
            for(int i = factor; i < N; i = i+factor){
                if(stalls[i] - stalls[i - factor] < min){
                    min = stalls[i] - stalls[i - factor];
                }
            }
            System.out.println(min);
        }
    }
}