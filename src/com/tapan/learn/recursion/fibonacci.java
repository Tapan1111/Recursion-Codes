package com.tapan.learn.recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n < 2){
            return n;
        }

        System.out.println();
        return fibo(n-1)+fibo(n-2);
    }
}
