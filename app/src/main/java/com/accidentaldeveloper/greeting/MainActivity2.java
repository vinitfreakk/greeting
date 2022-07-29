package com.accidentaldeveloper.greeting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textview3 = findViewById(R.id.textview3);
        Bundle extras = getIntent().getExtras();
        if(extras==null){
          return;
        }
        String msg = extras.getString("MyName");
        textview3.setText(""+msg);
    }
}