package in.rajegannathan.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/22/2015.
 * Treasure
 */
public class Main {
    public static void main(String[] args) throws Exception{
        FastIOReader reader = new FastIOReader();
        String str = reader.nextLine();

        int length = str.length();
        List<Integer> counts = new ArrayList<Integer>();
        Stack<Character> symbols = new Stack<Character>();
        boolean pendingPoundAction = false;

        for(int k = 0; k < length; k++){
            char ch = str.charAt(k);
            if (ch == '(') {
                if (pendingPoundAction) {
                    counts.add(symbols.size());
                    symbols.clear();
                    pendingPoundAction = false;
                }
                symbols.push(ch);

            } else if (ch == ')') {
                if (symbols.empty()) {
                    int size = counts.size();
                    for(int i = size-1; i >= 0; i--){
                        int value = counts.get(i);
                        if(value > 1){
                            counts.remove(i);
                            counts.add(i,value-1);
                        }
                    }
                }else {
                    symbols.pop();
                }

            } else if (ch == '#') {
                if (symbols.empty()) {
//                        System.out.println(-1);
                    break;
                }
                if(pendingPoundAction){
                    counts.add(1);
                    symbols.pop();
                }
                pendingPoundAction = true;

            }
//            System.out.println("Symbols size is "+symbols.size());
        }
        if(symbols.empty() && counts.size() == 0) {
            counts.add(-1);
        }else if(symbols.empty() && pendingPoundAction){
            int size = counts.size();
            for(int i = size-1; i >= 0; i--){
                int value = counts.get(i);
                if(value > 1){
                    counts.remove(i);
                    counts.add(i,value-1);
                }
            }
            counts.add(1);
        }else if(!symbols.empty() && pendingPoundAction){
            counts.add(symbols.size());
        }else if(!symbols.empty()){
            counts.clear();
            counts.add(-1);
        }
        for (int i : counts) {
            System.out.println(i);
        }
    }

    public static class FastIOReader {
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

    }
}