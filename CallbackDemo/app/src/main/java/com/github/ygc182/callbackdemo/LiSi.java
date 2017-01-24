package com.github.ygc182.callbackdemo;

import android.util.Log;

import com.github.ygc182.callbackdemo.myinterface.CallBack;

public class LiSi {
    private static final String TAG = "callback111";
    private CallBack mCallBack;
    private String mQuestion;

    public void executeMessage(CallBack callBack, String question) {
        mCallBack = callBack;
        mQuestion = question;
        Log.d(TAG, "来自张三的问题是： " + question);
    }

    public void handleQuestion() {
        for (int i = 0; i < 10; i++) {
            Log.d(TAG, "李四思考中……");
        }
        String result = "答案是2";
        mCallBack.solve(mQuestion);
    }
}
