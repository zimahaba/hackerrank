package edu.zimahaba.hackerrank.algorithms;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/extra-long-factorials/problem
 */
public class ExtraLongFactorials {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();

        int n = 21;

        BigInteger factorial = BigInteger.valueOf((long) n);

        for (int i = n-1; i > 1; i--) {
            BigInteger next = new BigInteger(String.valueOf(i));
            factorial = factorial.multiply(new BigInteger(next.toString()));
        }
        System.out.println(factorial);
    }
}
