package edu.zimahaba.hackerrank.algorithms;

/**
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
public class BirthdayChocolate {

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }*/

        //int day = in.nextInt();
        //int month = in.nextInt();

        //int[] arr = {1,2,1,3,2};
        //int[] arr = {1,1,1,1,1,1};
        int[] arr = {4};

        int day = 4;
        int month = 1;

        int count = 0;

        for (int i = 0; i < arr.length-(month-1); i++) {
            int segmentCount = arr[i];
            for (int j = i+1; j < i+month; j++) {
                segmentCount+=arr[j];
            }

            if (segmentCount == day) {
                count++;
            }

        }

        System.out.println(count);
    }
}
