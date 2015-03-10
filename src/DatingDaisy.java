import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 3/7/2015.
 */
public class DatingDaisy {
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

        int vWalk = reader.nextInt();
        int vBike = reader.nextInt();

        int x1 = reader.nextInt();
        int y1 = reader.nextInt();

        int x2 = reader.nextInt();
        int y2 = reader.nextInt();

        int xG = reader.nextInt();
        int yG = reader.nextInt();

        int xD = reader.nextInt();
        int yD = reader.nextInt();

        int bikeStationCount = reader.nextInt();
        int[] bikeStations = new int[bikeStationCount];

        for(int i = 0; i < bikeStationCount; i++){
            bikeStations[i] = reader.nextInt();
        }

        double  boyGirlDistance = distance(xG, yG, xD, yD);
        double bGWalkingSpeed = boyGirlDistance/vWalk;

        System.out.println(boyGirlDistance + " "+ bGWalkingSpeed);


    }

    private static double distance(int xG, int yG, int xD, int yD) {
        return Math.sqrt(((xD - xG)*(xD - xG)) + ((yD - yG)*(yD - yG)));
    }
}
