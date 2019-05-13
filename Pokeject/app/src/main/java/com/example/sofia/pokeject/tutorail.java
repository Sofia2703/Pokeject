package com.example.sofia.pokeject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tutorail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorail);
        final Button go = (Button) findViewById(R.id.btnGoTu);
        final Button back = (Button) findViewById(R.id.btnBackTu);
    }

    public void gotogame(View view){
        Intent in = new Intent(this,paoyinghard.class);
        this.startActivity(in);
    }
    public void back(View view){
        Intent in = new Intent(this,selectstage.class);
        this.startActivity(in);
    }
}
