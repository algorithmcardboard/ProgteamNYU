package in.rajegannathan.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/27/2015.
 * Anya and Smartphone
 */
public class AnyaAndSmartphone {
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
        int nApplications = reader.nextInt();
        int mAppsToLaunch = reader.nextInt();
        int kScreenSize = reader.nextInt();

        int[] A = new int[nApplications];
        int[] B = new int[mAppsToLaunch];
        int[] positions = new int[nApplications];

        for(int i = 0; i < nApplications; i++){
            A[i] = reader.nextInt();
            positions[A[i]-1] = i;
        }

        for(int i = 0; i < mAppsToLaunch; i++){
            B[i] = reader.nextInt();
        }

        reader.printArray(A, "A");
        reader.printArray(positions, "P");
        System.out.println();

        long totalGuestures = 0;
        for(int i = 0; i < B.length; i++){
            int appToLaunch = B[i];
            int appPosition = positions[appToLaunch - 1];
            totalGuestures += appPosition/kScreenSize + 1;

            if(appPosition > 0){
                int previousApp = A[appPosition - 1];
                int previousAppPosition = positions[previousApp - 1];
                positions[previousApp - 1] = positions[previousApp -1 ] + 1;
                positions[appToLaunch - 1] = positions[appToLaunch - 1] - 1;
                A[previousAppPosition] = appToLaunch;
                A[appPosition] = previousApp;
                System.out.println(previousApp + " "+ previousAppPosition + " " + appToLaunch + " " + appPosition);
            }
            reader.printArray(A, "A");
            reader.printArray(positions, "P");
            System.out.println();
        }
        System.out.println(totalGuestures);
    }
}
