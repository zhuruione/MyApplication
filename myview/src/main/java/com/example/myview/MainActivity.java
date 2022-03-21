package com.example.myview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout=findViewById(R.id.zr);
        final Myview myview=new Myview(this);
        myview.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                myview.nx=event.getX();
                myview.ny=event.getY();
                myview.invalidate();
                return true;
            }
        });
        frameLayout.addView(myview);
    }
}