package com.github.ygc182.callbackdemo;

import android.util.Log;

import com.github.ygc182.callbackdemo.myinterface.CallBack;

public class ZhangSan implements CallBack {
    private static final String TAG = "callback111";
    private LiSi ls;

    public ZhangSan(LiSi liSi) {
        ls = liSi;
    }

    public void askQuestion(final String question) {
        Log.d(TAG, "张三问李四问题： "+question);
        // 问问题
        new Thread(new Runnable() {
            @Override
            public void run() {
                ls.executeMessage(ZhangSan.this, question);
            }
        }).start();

        // 问完之后去玩
        Log.d(TAG, "我去玩了，知道答案了告诉我");
    }

    @Override
    public void solve(String result) {
        Log.d(TAG, "李四告诉张三的答案是： "+result);
    }
}
