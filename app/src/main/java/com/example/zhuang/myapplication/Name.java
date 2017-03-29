package com.example.zhuang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Name extends AppCompatActivity {
    Button button2;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        editText =(EditText)findViewById(R.id.editText);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        editText =(EditText)findViewById(R.id.editText);
        button2 = (Button)findViewById(R.id.button2);
        Button nextbutton = (Button)findViewById(R.id.button2);
        nextbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                Toast.makeText(Name.this, "Hello "+input, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(Name.this,MainActivity.class);
                startActivity(intent);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
