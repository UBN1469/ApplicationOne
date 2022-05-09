package com.mygeekbranch.applicationone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       textView = findViewById(R.id.textView);
        mButton = findViewById(R.id.button);

       mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateTextView(textView);
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