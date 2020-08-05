package edu.zimahaba.hackerrank.algorithms;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DivisibleSumPairs {

    public static void main(String[] args) throws IOException {

        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt();
        }*/

        int n = 100;
        int k = 76;

        int[] ar = {78, 93, 28, 4, 96, 99, 85, 30, 25, 30, 53, 81, 90, 63, 58, 99, 69, 20, 53, 33, 46, 31, 18, 58, 38, 29, 43, 30, 89, 57, 98, 11, 39, 38, 35, 23, 88, 64, 100, 44, 44, 23, 95, 21, 7, 96, 27, 79, 41, 40, 36, 49, 95, 44, 8, 44, 30, 34, 61, 34, 20, 92, 5, 24, 42, 49, 54, 89, 39, 64, 44, 4, 45, 74, 81, 20, 24, 97, 100, 84, 43, 88, 20, 83, 65, 64, 80, 16, 92, 56, 75, 13, 15, 68, 91, 4, 89, 85, 25, 97};

        Arrays.sort(ar);

        int result = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                int first = ar[i];
                int second = ar[j];
                if ((first+second)%k == 0) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
