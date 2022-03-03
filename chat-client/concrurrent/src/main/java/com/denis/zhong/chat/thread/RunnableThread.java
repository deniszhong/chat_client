package com.denis.zhong.chat.thread;

/**
 * 功能：
 *
 * @Author: zfzhong
 * @Date: 2022/3/3$ 13:22$
 * @ClassName: RunnableThread$
 * Company: ichint.com Inc.
 * @Version: 1.0.0
 * Copyright: Copyright (c) 1984-2022 All Rights Reserved.
 */
public class RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("用实现Runnable接口实现线程");
    }
}
