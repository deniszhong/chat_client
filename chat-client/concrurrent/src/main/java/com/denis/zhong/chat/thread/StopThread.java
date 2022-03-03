package com.denis.zhong.chat.thread;

/**
 * 功能：正确停止线程
 *
 * @Author: zfzhong
 * @Date: 2022/3/3$ 13:59$
 * @ClassName: StopThread$
 * Company: ichint.com Inc.
 * @Version: 1.0.0
 * Copyright: Copyright (c) 1984-2022 All Rights Reserved.
 */

public class StopThread implements Runnable{
    @Override
    public void run() {
        int count = 0;
        while (!Thread.currentThread().isInterrupted() && count < 1000) {
            System.out.println("count = " + count++);

        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new StopThread());

        thread.start();

        Thread.sleep(5);

        thread.interrupt();
    }
}


