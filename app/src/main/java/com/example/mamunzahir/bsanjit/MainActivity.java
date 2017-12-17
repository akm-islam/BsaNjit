package com.example.mamunzahir.bsanjit;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout b1;
    ConstraintLayout b2;
    ConstraintLayout b3;
    ConstraintLayout b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout3);
        b1= (ConstraintLayout) findViewById(R.id.button1);
        b2= (ConstraintLayout) findViewById(R.id.button2);
        b3= (ConstraintLayout) findViewById(R.id.button3);
        b4= (ConstraintLayout) findViewById(R.id.button4);
    }

    public void buclick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Toast.makeText(this,"Hello button1",Toast.LENGTH_LONG).show();
            case R.id.button2:
                Toast.makeText(this,"Hello button2",Toast.LENGTH_LONG).show();
            case R.id.button3:
                Toast.makeText(this,"Hello button3",Toast.LENGTH_LONG).show();
            case R.id.button4:
                Toast.makeText(this,"Hello button4",Toast.LENGTH_LONG).show();

        }
    }
}
