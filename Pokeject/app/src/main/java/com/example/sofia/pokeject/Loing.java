package com.example.sofia.pokeject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Loing extends AppCompatActivity {
    EditText name,phone;
    Button gopage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loing);

        name = (EditText) findViewById(R.id.editName);
        phone = (EditText) findViewById(R.id.editPhone);
        gopage = (Button) findViewById(R.id.btnlogin);
    }

    public  void OnLogin(View view){
        String Sname = name.getText().toString();
        String Sphone = name.getText().toString();
        String type = "login";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,Sname,Sphone);
    }
}
