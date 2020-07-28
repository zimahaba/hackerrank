package edu.zimahaba.hackerrank.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 */
public class BetweenTwoSets {

    public static int getTotalX(int[] a, int[] b) {

        int count = 0;
        for (int i = a[a.length-1]; i <= b[0]; i++) {

            boolean isAfactor = true;
            for (int j = 0; j < a.length; j++) {
                if (i%a[j]!=0) {
                    isAfactor=false;
                    break;
                }
            }

            if (isAfactor) {
                boolean isBfactor = true;
                for (int j = 0; j < b.length; j++) {
                    if (b[j]%i!=0) {
                        isBfactor=false;
                        break;
                    }
                }
                if (isBfactor) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for(int a_i=0; a_i < n; a_i++){
            arr[a_i] = in.nextInt();
        }

        int[] brr = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            brr[b_i] = in.nextInt();
        }

        int total = getTotalX(arr, brr);

        System.out.println(total);
    }
}
