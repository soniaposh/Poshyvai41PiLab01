package com.example.poshyvai41pilab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spin;
    TextView txtview;
    String res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin  =  findViewById(R.id.spinner5);
        txtview =  findViewById(R.id.textView2);
    }

    public void getDescription(View view) {
        res = getResources().getStringArray(R.array.job_descriptions)[spin.getSelectedItemPosition()];
        txtview.setText(res);
    }

}
