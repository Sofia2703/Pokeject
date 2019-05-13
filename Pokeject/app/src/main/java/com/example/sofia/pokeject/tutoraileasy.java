package com.example.sofia.pokeject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tutoraileasy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutoraileasy);
        final Button gotu = (Button) findViewById(R.id.btnGotu);
        final Button backtu = (Button) findViewById(R.id.btnBacktu);
    }

    public void gotogame(View view){
        Intent in = new Intent(this,PaoyingPage.class);
        this.startActivity(in);
    }
    public void back(View view){
        Intent in = new Intent(this,selectstage.class);
        this.startActivity(in);
    }
}
