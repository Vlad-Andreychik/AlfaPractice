package com.Alfa;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] revArray = ArrayAlgorithms.reverseArray(new int[]{1, 2, 3, 4});
        for (int x : revArray) {
            System.out.println(x);
        }

        System.out.println(Factorial.rekurs(5));
        System.out.println(Factorial.nonRekurs(5));

        Fibonacci.displaySequence(5);
        int[] fibArr = Fibonacci.createArr(6);
        for (int x : fibArr) {
            System.out.println(x);
        }
        System.out.println(Fibonacci.findNumber(7));

        String[] strArr = splitString.splitWithDelimiter("hey bro", " ");
        for (String x : strArr) {
            System.out.println(x);
        }

        StreamApi.fromNegativeToPositive(new int[]{1, 3, 4, -4, -3});
        StreamApi.evenMultiOddDiff(new int[]{1, 2, 3, 4, 5});
        List<String> surnArr = StreamApi.chooseSurnameStartingWithA(new String[]{"andrew", "cole", "Alba"});
        for (String x : surnArr) {
            System.out.println(x);
        }
    }
}
