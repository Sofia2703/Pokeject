package com.example.sofia.pokeject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class winpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winpage);
        
        
        Button win = (Button) findViewById(R.id.btnPlayWin);
        Button backwin = (Button) findViewById(R.id.btnBackWin);

        win.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(winpage.this,xofight.class);
                startActivity(i);
            }
        });

        backwin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(winpage.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
