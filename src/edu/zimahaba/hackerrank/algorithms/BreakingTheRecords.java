package edu.zimahaba.hackerrank.algorithms;

import java.util.Scanner;

public class BreakingTheRecords {

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }*/

        int[] arr = {100000000, 100000000, 10000000, 10000000, 1000000};
        //int[] arr = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        //int[] arr = {10, 5, 20, 20, 4, 5, 2, 25, 1};

        int highest = arr[0];
        int lowest = arr[0];
        int countBreakMax = 0;
        int countBreakMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>highest) {
                highest = arr[i];
                countBreakMax++;
            }
            if (arr[i]<lowest) {
                lowest = arr[i];
                countBreakMin++;
            }
        }
        System.out.println(countBreakMax + " " + countBreakMin);
    }
}
