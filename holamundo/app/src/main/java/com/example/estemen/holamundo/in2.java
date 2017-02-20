package com.example.estemen.holamundo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by EsteMen on 10/02/2017.
 */
public class in2 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        Bundle datos = this.getIntent().getExtras();
        Double rec = datos.getDouble("resul");
        TextView tv = (TextView) findViewById(R.id.pan);
        tv.setText(rec.toString());
    }





}


