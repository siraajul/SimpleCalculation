package com.doridcode.simplecalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edBuy,edSell;
    Button btnCalculate;
    TextView tvOutput

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edBuy=findViewById(R.id.edBuy);
        edSell=findViewById(R.id.edSell);
        btnCalculate=findViewById(R.id.btnCalculate);
        tvOutput=findViewById(R.id.tvOutput);

    }
}