package com.example.sofia.pokeject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sofia.pokeject.list.Maineasy;

public class losepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losepage);

        Button lose = (Button) findViewById(R.id.btnPlaylose);
        Button backlose = (Button) findViewById(R.id.btnBacklose);

        lose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(losepage.this,xofight.class);
                startActivity(i);
            }
        });

        backlose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(losepage.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
