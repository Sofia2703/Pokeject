package com.example.sofia.pokeject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sofia.pokeject.list.Maineasy;
import com.example.sofia.pokeject.listHard.mo;

public class selectrank extends AppCompatActivity {
    private Button toe,toh,backr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectrank);

        toe = (Button) findViewById(R.id.btnEasyRank);
        toh = (Button) findViewById(R.id.btnHardRank);
        backr = (Button) findViewById(R.id.btnBackRank);

       toe.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent in = new Intent(selectrank.this,Maineasy.class);
               startActivity(in);
           }
       });

       toh.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent in = new Intent(selectrank.this,mo.class);
               startActivity(in);
           }
       });

        backr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(selectrank.this,selectstage.class);
                startActivity(in);
            }
        });
    }
}
