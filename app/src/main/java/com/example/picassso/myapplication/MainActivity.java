package com.example.picassso.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv ;
    Button btnRoll;
    int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView)findViewById(R.id.txtMy);
         btnRoll=(Button)findViewById(R.id.btnButton);
    }
//todo make it good

   public void rollDice (View v)
    {
count++;
        tv.setText("TADA!!" + count);
    }
}
