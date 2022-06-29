package com.shizi.demo01;

//1、继承thread 2、重写run 3、调用start

//同时执行的

public class TestThread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("我在看代码----" + i);
        }
    }

    public static void main(String[] args) {

        TestThread1 testThread1 = new TestThread1();
        testThread1.start();

        for (int i = 0; i < 500; i++) {
            System.out.println("我在学习多线程呢----" + i );
        }
    }
}
