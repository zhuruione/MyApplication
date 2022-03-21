package com.example.radiobuttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup=findViewById(R.id.sex_radio);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton=findViewById(checkedId);
                Toast.makeText(MainActivity.this,radioButton.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        Button button=findViewById(R.id.sex_radio_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<radioGroup.getChildCount();i++){
                    RadioButton r=(RadioButton)radioGroup.getChildAt(i);
                    if(r.isChecked()){
                        Toast.makeText(MainActivity.this,"性别为"+r.getText().toString(),Toast.LENGTH_SHORT).show();
                        r.setText("zr");
                        break;
                    }
                }
            }
        });
    }
}