package com.shizi.demo01;

public class TestThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("我在看代码----" + i);
        }
    }

    public static void main(String[] args) {

        TestThread2 testThread2 = new TestThread2();

        //代理
        Thread thread = new Thread(testThread2);
        thread.start();

        for (int i = 0; i < 500; i++) {
            System.out.println("我在学习多线程呢----" + i );
        }
    }
}
