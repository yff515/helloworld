package com.yff.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=findViewById(R.id.button1);
        Switch switch1=findViewById(R.id.switch1);
        CheckBox box1=findViewById(R.id.Box1);
        final TextView text2=findViewById(R.id.textView2);
        final TextView text1=findViewById(R.id.text1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("clicked");
                Log.d("MainActivity","clicked");
            }

        });
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    text1.setText("开启");
                }
            }
        });
        box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    if(text2.getVisibility()==View.VISIBLE){
                        text2.setText("显示");
                    }else {
                        text2.setVisibility(View.VISIBLE);
                        text2.setText("显示");
                    }
                }
                else
                {
                    text2.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
