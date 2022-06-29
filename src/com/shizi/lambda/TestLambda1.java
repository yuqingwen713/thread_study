package com.shizi.lambda;

/*
推导 lambda 表达式
 */
public class TestLambda1 {
    public static void main(String[] args) {
        Runnable test=()->{
            System.out.println("111");
        };
        test.run();
    }
}

interface Runnable{
    public abstract void run();
}