package com.jiangdg.usbcamera.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.jiangdg.usbcamera.R;

/**
 * created by Administrator on 2018/10/13 16:16
 */
public class MainActivity extends Activity implements View.OnClickListener {

    private Button mBtnCamera;
    private Button mBtnZxing;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtnCamera = (Button) findViewById(R.id.btn_camera);
        mBtnZxing = (Button) findViewById(R.id.btn_zxing);

        mBtnCamera.setOnClickListener(this);
        mBtnZxing.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_camera:
                startActivity(USBCameraActivity.newIntent(MainActivity.this, 1));
                break;
            case R.id.btn_zxing:
                startActivity(USBCameraActivity.newIntent(MainActivity.this, 2));
                break;
        }
    }
}