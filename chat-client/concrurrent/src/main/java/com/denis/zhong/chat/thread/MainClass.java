package com.denis.zhong.chat.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 功能：
 *
 * @Author: zfzhong
 * @Date: 2022/3/3$ 13:26$
 * @ClassName: MainClass$
 * Company: ichint.com Inc.
 * @Version: 1.0.0
 * Copyright: Copyright (c) 1984-2022 All Rights Reserved.
 */
public class MainClass {

    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<Integer> future = executorService.submit(new CallableTask());

        System.out.println(future.get());
    }
}
