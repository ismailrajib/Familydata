package com.example.mohammedismail.familydata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnClick1,btnClick2,btnClick3,btnClick4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnClick1= (Button) findViewById(R.id.baba);
        btnClick2= (Button) findViewById(R.id.ma);
        btnClick3= (Button) findViewById(R.id.vai);
        btnClick4= (Button) findViewById(R.id.bon);
        btnClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,mother.class);
                startActivity(intent);
            }
        });
        btnClick3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Brother.class);
                startActivity(intent);
            }
        });
        btnClick4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Sister.class);
                startActivity(intent);
            }
        });


        btnClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,familysecondactivity.class);
                startActivity(intent);
            }
        });    }
}
