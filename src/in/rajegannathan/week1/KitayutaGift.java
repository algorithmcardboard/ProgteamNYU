package in.rajegannathan.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Anirudhan on 2/6/2015.
 */
public class KitayutaGift {
    private static StringBuffer makePalindrome(StringBuffer buffer, int start, int end){
        if(start == end){
            return new StringBuffer(buffer.substring(0,start)+buffer.charAt(start)+buffer.substring(start));
        }
        if(start > end){
            return new StringBuffer(buffer.substring(0,start) + 'y' + buffer.substring(start));
        }
        if(buffer.charAt(start) == buffer.charAt(end)){
            return makePalindrome(buffer, start + 1, end - 1);
        }else if(buffer.charAt(start+1) == buffer.charAt(end)){
            return new StringBuffer(buffer.substring(0,end+1)+buffer.charAt(start)+buffer.substring(end+1));
        }else if(buffer.charAt(start) == buffer.charAt(end -1)){
            return new StringBuffer(buffer.substring(0,start)+buffer.charAt(end)+buffer.substring(start));
        }
        return buffer;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();

        StringBuffer pal = makePalindrome(new StringBuffer(line), 0, line.length() - 1);
        System.out.println(pal);
        int length = pal.length();
        for(int i = 0; i < (length/2); i++){
            if(pal.charAt(i) != pal.charAt(length-1-i)){
                pal = new StringBuffer("NA");
                break;
            }
        }
        System.out.println(pal);
    }
}