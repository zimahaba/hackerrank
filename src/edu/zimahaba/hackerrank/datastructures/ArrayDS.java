package edu.zimahaba.hackerrank.datastructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/arrays-ds/problem
 */
public class ArrayDS {

    public static void main(String[] args) {


        /*Scanner in = new Scanner(System.in);
        int arrCount = in.nextInt();

        int[] arr = new int[arrCount];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }*/

        int arrCount = 4;

        int[] arr = {1, 4, 3, 2};

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
            stringBuilder.append(arr[i] + " ");
        }
        System.out.println(stringBuilder.toString());
    }
}

