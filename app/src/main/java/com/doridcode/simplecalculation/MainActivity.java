package com.doridcode.simplecalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText entername;
    Button outputbutton;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entername=findViewById(R.id.entername);
        outputbutton=findViewById(R.id.outputbutton);
        output=findViewById(R.id.output);


        outputbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = entername.getText().toString();
                output.setText("Hello "+ username+"\nGreat Work!");
            }
        });


    }
}