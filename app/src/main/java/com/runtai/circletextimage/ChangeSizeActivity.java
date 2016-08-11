package com.runtai.circletextimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.runtai.library.view.CircleTextImage;

public class ChangeSizeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        CircleTextImage cti1 = (CircleTextImage) findViewById(R.id.cti1);
        cti1.setText4CircleImage("JavaJavaJava");

        CircleTextImage cti2 = (CircleTextImage) findViewById(R.id.cti2);
        cti2.setText4CircleImage("JavaScript");

        CircleTextImage cti3 = (CircleTextImage) findViewById(R.id.cti3);
        cti3.setText4CircleImage("好好学习，天天向上！");

    }
}
