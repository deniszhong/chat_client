package com.denis.zhong.chat.thread;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * 功能：
 *
 * @Author: zfzhong
 * @Date: 2022/3/3$ 13:25$
 * @ClassName: CallableTask$
 * Company: ichint.com Inc.
 * @Version: 1.0.0
 * Copyright: Copyright (c) 1984-2022 All Rights Reserved.
 */
public class CallableTask  implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}
