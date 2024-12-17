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

public class DivisionActivity extends AppCompatActivity {
Button bd1,bd2;
EditText ed1,ed2;
String g1,g2,result;
int n1,n2,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_division);

        bd1=(Button) findViewById(R.id.divy);
        bd2=(Button) findViewById(R.id.dback);
        ed1=(EditText)findViewById(R.id.dn1);
        ed2=(EditText)findViewById(R.id.dn2);


        bd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                g1=ed1.getText().toString();
                g2=ed2.getText().toString();
                n1=Integer.parseInt(g1);
                n2=Integer.parseInt(g2);
                s=n1/n2;
                result=String.valueOf(s);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });
        bd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });
        };
    }
