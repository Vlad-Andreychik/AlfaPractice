package com.Alfa;

public class Fibonacci {
    public static void displaySequence(int n){
        int current = 0;
        int previous = 0;
        int last = 1;
        System.out.println(previous);
        System.out.println(last);
        for (int i = 0; i < n - 2; i++) {
            System.out.println(current = last + previous);
            previous = last;
            last = current;
        }
    }
    public static int[] createArr(int n){
        int current = 0;
        int previous = 0;
        int last = 1;
        int[] fib = new int[n];
        fib[0] = current;
        fib[1] = last;
        for (int i = 2; i < n; i++) {
            current = last + previous;
            fib[i] = current;
            previous = last;
            last = current;
        }
        return fib;
    }
    public static int findNumber(int n){
        int current = 0;
        int previous = 0;
        int last = 1;
        for (int i = 0; i < n - 2; i++) {
            current = previous + last;
            previous = last;
            last = current;
        }
        return current;
    }
}
