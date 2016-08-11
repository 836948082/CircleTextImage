package com.runtai.circletextimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.runtai.library.view.CircleTextImage;

public class SubFirstCharacterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout5);

        CircleTextImage cti5 = (CircleTextImage) findViewById(R.id.cti5);
        cti5.setText4CircleImage("python");

    }

}
