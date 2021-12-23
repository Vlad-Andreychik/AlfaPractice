package com.Alfa;

public class Factorial {
    public static int rekurs(int n){
        int result = 1;
        if (n == 0 || n == 1){
            return result;
        }
        result = n* rekurs(n-1);
        return result;
    }

    public static int nonRekurs(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
