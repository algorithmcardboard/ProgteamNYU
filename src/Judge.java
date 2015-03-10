import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 3/7/2015.
 */
public class Judge {
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

        int count = reader.nextInt();
        int[] domJudge = {0,0,0};
        int[] katis = {0,0,0};
        for(int i = 0; i < count; i++){
            String verdict = reader.nextLine();
            if(verdict.equals("correct")){
                domJudge[0] = domJudge[0]+1;
            }else if(verdict.equals("wronganswer")){
                domJudge[1] = domJudge[1]+1;
            }else if(verdict.equals("timelimit")){
                domJudge[2] = domJudge[2]+1;
            }
        }
        for(int i = 0; i < count; i++){
            String verdict = reader.nextLine();
            if(verdict.equals("correct")){
                katis[0] = katis[0]+1;
            }else if(verdict.equals("wronganswer")){
                katis[1] = katis[1]+1;
            }else if(verdict.equals("timelimit")){
                katis[2] = katis[2]+1;
            }
        }
        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += Math.min(domJudge[i], katis[i]);
        }

        System.out.println(sum);
    }
}
