package com.Alfa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void fromNegativeToPositive(int[] arr) {
        Arrays.stream(arr).map(Math::abs).forEach(System.out::println);
    }

    public static void evenMultiOddDiff(int[] arr) {
        Arrays.stream(arr).map(x -> x % 2 == 0 ? x * 100 : x - 100).forEach(System.out::println);
    }

    public static List<String> chooseSurnameStartingWithA(String[] arr) {
        return Arrays.stream(arr).filter(surname -> surname.startsWith("A")).collect(Collectors.toList());
    }
}
