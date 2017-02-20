package com.junhui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.junhui.widget.TouchProgressView;

public class MainActivity extends AppCompatActivity implements TouchProgressView.OnProgressChangedListener {
    private static final String TAG = "MainActivity";

    TextView tvProgress;
    TouchProgressView proViewDft;
    TouchProgressView proViewStyle1;
    TouchProgressView proViewStyle2;
    TouchProgressView proViewStyle3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        tvProgress = (TextView) findViewById(R.id.tv_progress);
        proViewDft = (TouchProgressView) findViewById(R.id.proview_dft);
        proViewDft.setProgress(15);
        proViewDft.setOnProgressChangedListener(this);

        proViewStyle1 = (TouchProgressView) findViewById(R.id.proview_style1);
        proViewStyle1.setOnProgressChangedListener(this);
        proViewStyle1.setLineColor(R.color.colorPrimary);
        proViewStyle1.setLineHeight(5);
        proViewStyle1.setProgress(50);

        proViewStyle2 = (TouchProgressView) findViewById(R.id.proview_style2);
        proViewStyle2.setOnProgressChangedListener(this);
        proViewStyle2.setPointColor(R.color.colorPrimary);
        proViewStyle2.setPointRadius(20);
        proViewStyle2.setProgress(33);

        proViewStyle3 = (TouchProgressView) findViewById(R.id.proview_style3);
        proViewStyle3.setOnProgressChangedListener(this);
        proViewStyle3.setLineColor(R.color.colorAccent);
        proViewStyle3.setLineHeight(10);
        proViewStyle3.setProgress(75);
        proViewStyle3.setPointColor(R.color.colorAccent);
        proViewStyle3.setPointRadius(20);
    }

    @Override
    public void onProgressChanged(View v, int progress) {
        String name = null;
        switch (v.getId()) {
            case R.id.proview_dft:
                name = "proViewDft";
                break;
            case R.id.proview_style1:
                name = "proViewStyle1";
                break;
            case R.id.proview_style2:
                name = "proViewStyle2";
                break;
            case R.id.proview_style3:
                name = "proViewStyle3";
                break;
        }
        Log.i(TAG, name + " 进度发生变化, progress == " + progress);
        tvProgress.setText(progress + "%");
    }

}
