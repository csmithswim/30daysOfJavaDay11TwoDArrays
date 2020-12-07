package com.csmithswim;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        //Arrays 0 - 4 is the first element of the hourglass
        //9 non zero elements to make an hour glass

        ArrayList<Integer> hourGlassSums = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
//                if (arr[i][j] != 0 && arr[i][j+1] != 0 && arr[i][j+2]!=0
//                    && arr[i+1][j+1] != 0
//                    && arr[i+2][j] != 0 && arr[i+2][j+1] != 0 && arr[i+2][j+2]!=0) {

                    hourGlassSums.add(arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);

//                }
            }
        }
        Collections.sort(hourGlassSums);
//        System.out.println(hourGlassSums);
        System.out.println(hourGlassSums.get(hourGlassSums.size()-1));



        scanner.close();
    }
}

/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 9 2 -4 -4 0
0 0 0 -2 0 0
0 0 -1 -2 -4 0
 */