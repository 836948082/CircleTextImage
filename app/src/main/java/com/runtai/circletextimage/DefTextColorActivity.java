package com.runtai.circletextimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.runtai.library.view.CircleTextImage;

public class DefTextColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);

        CircleTextImage cti6 = (CircleTextImage) findViewById(R.id.cti6);
        cti6.setText4CircleImage("Object-C");

    }
}
