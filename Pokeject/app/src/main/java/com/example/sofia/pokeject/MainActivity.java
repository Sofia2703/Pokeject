package com.example.sofia.pokeject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sofia.pokeject.list.Maineasy;
import com.example.sofia.pokeject.listHard.mo;

public class MainActivity extends AppCompatActivity {
    private TextView tLink;
    private Button btFight,btXo;
    private EditText Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btFight = (Button) findViewById(R.id.btnFight);
        btXo = (Button) findViewById(R.id.btnXO);
        //Name =(EditText) findViewById(R.id.txtName);
    }

    public void GoFight(View view){
        /*String name = this.Name.getText().toString();
        in.putExtra("player",name);*/
        Intent in = new Intent(this,selectstage.class);
        this.startActivity(in);
    }
    public void GoXo(View view){
        Intent in = new Intent(this,xofight.class);
        this.startActivity(in);

    }
}
