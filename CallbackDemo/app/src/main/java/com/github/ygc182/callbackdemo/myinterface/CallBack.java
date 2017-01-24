package com.github.ygc182.callbackdemo.myinterface;

/**
 * 自定义接口,
 * Created by YGC on 17/1/23.
 */

public interface CallBack {
    /**
     * 回调函数，当李四知道答案后，需要回调的函数，告诉张三答案
     * @param result
     */
    void solve(String result);
}
