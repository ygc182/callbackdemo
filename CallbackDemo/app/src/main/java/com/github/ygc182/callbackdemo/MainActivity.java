package com.github.ygc182.callbackdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LiSi mLiSi;
    private ZhangSan mZhangSan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn);
        Button handleBtn = (Button) findViewById(R.id.handleBtn);
        btn.setOnClickListener(this);
        handleBtn.setOnClickListener(this);
        mLiSi = new LiSi();
        mZhangSan = new ZhangSan(mLiSi);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                mZhangSan.askQuestion("1+1=?");
                break;
            case R.id.handleBtn:
                mLiSi.handleQuestion();
                break;
        }
    }
}
