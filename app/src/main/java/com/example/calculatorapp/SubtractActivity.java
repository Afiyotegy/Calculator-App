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

public class SubtractActivity extends AppCompatActivity {
Button bs1,bs2;
EditText es1,es2;
String get1,get2,result;
int n1,n2,s=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtract);

        bs1=(Button) findViewById(R.id.subby);
        bs2=(Button) findViewById(R.id.sback);
        es1=(EditText)findViewById(R.id.sn1);
        es2=(EditText)findViewById(R.id.sn2);

        bs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                get1=es1.getText().toString();
                get2=es2.getText().toString();
                n1=Integer.parseInt(get1);
                n2=Integer.parseInt(get2);
                s=n1-n2;
                result=String.valueOf(s);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });
        bs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });
        };
    }
