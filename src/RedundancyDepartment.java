import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by anirudhan on 4/10/15.
 */
public class RedundancyDepartment {
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

        Map<Integer,Integer> values = new LinkedHashMap<Integer, Integer>();

        String str = reader.nextLine();
        while(!str.equals("")) {
            StringTokenizer st = new StringTokenizer(str);
            while (st.hasMoreTokens()) {
                int val = Integer.parseInt(st.nextToken());
                if (!values.containsKey(val)) {
                    values.put(val, 0);
                }
                values.put(val, values.get(val) + 1);
            }
            str = reader.nextLine();
        }

        for (Map.Entry<Integer, Integer> entry : values.entrySet()) {
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

    }
}
