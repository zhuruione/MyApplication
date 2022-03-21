package com.example.alllayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText text=findViewById(R.id.username);
        Button button=findViewById(R.id.bu1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this).setTitle("提示").setMessage(text.getText().toString()).setPositiveButton("确认",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Log.i("zr",text.getText().toString());
                            }
                        }).setNegativeButton("退出", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i("zr","拜拜");
                        finish();
                    }
                }).show();
            }
        });
        text.getText();
    }
    public void bu2click(View view){
        Toast.makeText(MainActivity.this,"单击了按钮2！",Toast.LENGTH_SHORT).show();
    }
    public void bu3click(View view){
        Toast.makeText(MainActivity.this,"单击了按钮3！",Toast.LENGTH_SHORT).show();
    }
}