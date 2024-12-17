package com.example.calculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {
          Button ba1,ba2;
          EditText ea1,ea2;
          String getNum1,getNum2,result;
          int na1,na2,s=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

        ba1=(Button) findViewById(R.id.addy);
        ba2=(Button) findViewById(R.id.aback);
        ea1=(EditText)findViewById(R.id.an1);
        ea2=(EditText)findViewById(R.id.an1);

        ba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getNum1=ea1.getText().toString();
                getNum2=ea2.getText().toString();
                na1=Integer.parseInt(getNum1);
                na2=Integer.parseInt(getNum2);
                s=na1+na2;
                result=String.valueOf(s);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });
        ba2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });
        };
    }
