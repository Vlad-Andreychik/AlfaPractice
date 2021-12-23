package com.Alfa;

import java.lang.reflect.Array;

public class ArrayAlgorithms {
    public static int[] reverseArray(int[] arr){
        int[] reversed = new int[arr.length];
        for (int i = arr.length; i > 0 ; i--) {
            reversed[arr.length - i] = arr[i - 1];
        }
        return reversed;
    }

}
