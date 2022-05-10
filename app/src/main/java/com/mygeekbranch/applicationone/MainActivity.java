package com.mygeekbranch.applicationone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button mButton;
    Button activity2Button;
    Button activity3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       textView = findViewById(R.id.textView);
        mButton = findViewById(R.id.button);
        activity2Button = findViewById(R.id.activity2);
        activity3Button =findViewById(R.id.activity3);

       mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateTextView(textView);
            }
        });
        activity2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TwoActivity.class);
                startActivity(intent);
            }
        });  activity3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ThreeActivity.class);
                startActivity(intent);
            }
        });


      // updateTextView(textView);
    }

    public void updateTextView(TextView textView){
        String str = (String) textView.getText();
        str = str + " ПРИВЕТ";
        textView.setText(str);
    }
}