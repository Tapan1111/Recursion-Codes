package com.tapan.learn.recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);

    }
    static void print(int n){
        if(n > 100){
            return;
        }

        System.out.println(n);
        print(n+1);
    }
}
