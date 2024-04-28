package com.example.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lrf
 */
public class Main2 {

    public static void main(String[] args) {
        Queue<Thread> tasks = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            int finalI = i + 1;
            tasks.add(new Thread(() -> System.out.println("我是任务" + finalI + "执行了..."), "Thread" + finalI));
        }
        while (!tasks.isEmpty()) {
            tasks.poll().start();
        }
    }
    
    public static Runnable getRun() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("100");
            }
        };
    }
    
    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("执行run方法" + this.getName());
        }
    }

}
