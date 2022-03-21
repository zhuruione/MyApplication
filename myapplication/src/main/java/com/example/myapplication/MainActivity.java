package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView[] imageViews =new ImageView[12];
    private  int[] imagepath=new int[]{
            R.mipmap.png1,R.mipmap.png2,R.mipmap.png3,
            R.mipmap.png4,R.mipmap.png5,R.mipmap.png6,
            R.mipmap.png7,R.mipmap.png8,R.mipmap.png9,
            R.mipmap.png10,R.mipmap.png11,R.mipmap.png12
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout layout=(GridLayout)findViewById(R.id.layout);
        for(int i=0;i<imagepath.length;i++){
            imageViews[i]=new ImageView((MainActivity.this));
            imageViews[i].setImageResource(imagepath[i]);
            imageViews[i].setPadding(2,2,2,2);
            imageViews[i].setLayoutParams(new ViewGroup.LayoutParams(300,600));
            layout.addView(imageViews[i]);
        }
    }
}