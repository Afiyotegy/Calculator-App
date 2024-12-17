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

public class MultiplyActivity extends AppCompatActivity {
Button bm1,bm2;
EditText em1,em2;
int n1,n2,s;
String g1,g2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiply);

        bm1=(Button) findViewById(R.id.mully);
        bm2=(Button) findViewById(R.id.mback);
        em1=(EditText) findViewById(R.id.mn1);
        em2=(EditText) findViewById(R.id.mn2);

        bm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                g1=em1.getText().toString();
                g2=em2.getText().toString();
                n1=Integer.parseInt(g1);
                n2=Integer.parseInt(g2);
                s=n1*n2;
                result=String.valueOf(s);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });
        bm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });
        };
    }
