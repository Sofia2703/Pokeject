package com.example.sofia.pokeject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selectstage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectstage);
        final Button back = (Button) findViewById(R.id.btnBackSelect);
        final Button easy = (Button) findViewById(R.id.btnEasy);
        final Button hard = (Button) findViewById(R.id.btnHard);
        final Button rank = (Button) findViewById(R.id.btnRank);
    }
    public void back(View view){
        Intent in = new Intent(this,MainActivity.class);
        this.startActivity(in);
    }
    public void easy(View view){
        Intent in = new Intent(this,tutoraileasy.class);
        this.startActivity(in);
    }
    public void hard(View view){
        Intent in = new Intent(this,tutorail.class);
        this.startActivity(in);
    }
    public void rank(View view){
        Intent in = new Intent(this,selectrank.class);
        this.startActivity(in);
    }
}
