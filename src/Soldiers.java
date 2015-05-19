import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by anirudhan on 4/3/15.
 */
public class Soldiers {
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

    public static void main(String[] args){
        FastIOReader reader = new FastIOReader();

        int numSoldiers = reader.nextInt();

        int[] soldiers = new int[numSoldiers];
        int[] aux = new int[numSoldiers];

        int min = 0;
        int secondMin = 0;

        for(int i = 0; i < numSoldiers; i++) {
            soldiers[i] = reader.nextInt();
            if(i == 0){
                continue;
            }
            aux[i-1] = Math.abs(soldiers[i] - soldiers[i-1]);
        }
        aux[numSoldiers-1]  = Math.abs(soldiers[numSoldiers-1]-soldiers[0]);

        int minDiff = Integer.MAX_VALUE; int minIndex = -1;
        for(int i = 0; i < numSoldiers; i++){
            if(aux[i] < minDiff){
                minDiff = aux[i];
                minIndex = i;
                min = i;
                secondMin = i+1;
            }
        }
//        System.out.println(minIndex);
        System.out.println((min+1) + " "+ (secondMin==numSoldiers?1:secondMin+1));
    }
}
