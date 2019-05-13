package com.example.sofia.pokeject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class rank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);
        final ImageButton back = (ImageButton) findViewById(R.id.imnbBackHard);
    }
    public void back(View view){
        Intent in = new Intent(this,selectstage.class);
        this.startActivity(in);
    }
}
