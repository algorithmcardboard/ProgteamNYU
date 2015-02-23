package in.rajegannathan.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Anirudhan on 2/6/2015.
 */
public class Relational {
    public static void main(String args[]) throws Exception{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String line = stdin.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int count = Integer.parseInt(st.nextToken());
        int first, second, iterator;
        for(iterator = 0; iterator < count; iterator++){
            line = stdin.readLine();
            st = new StringTokenizer(line);
            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());
            if(first < second){
                System.out.println("<");
            }else if (first > second){
                System.out.println(">");
            }else{
                System.out.println("=");
            }
        }
    }
}


/*
import java.io.*;
import java.util.*;

public class SherlockAndTheGrid
{
 public static void main (String args[]) throws Exception
    {
 BufferedReader stdin =
 new BufferedReader(
 new InputStreamReader(System.in));

 String line = stdin.readLine();
 StringTokenizer st = new StringTokenizer(line);
 int a = Integer.parseInt(st.nextToken());
 int b = Integer.parseInt(st.nextToken());
 System.out.println(a+b);
    }
}
 */