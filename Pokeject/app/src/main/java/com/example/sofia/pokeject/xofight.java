package com.example.sofia.pokeject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class xofight extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turn;
    int XScore, OScore;
    private TextView green,som;
    boolean end = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xofight);

        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        green = (TextView) findViewById(R.id.ScoreGre);
        som = (TextView) findViewById(R.id.ScoreOrg);

        final Button back = (Button) findViewById(R.id.btnbackXo);
        final Button newpage = (Button) findViewById(R.id.btnNew);
        turn=1;

        newpage.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view) {
               Intent i = new Intent(xofight.this,xofight.class);
               startActivity(i);
           }
       });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(b1.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b1.setText("X");
                    }else if (turn == 2){
                        turn = 1;
                        b1.setText("O");
                    }
                }
                endgame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(b2.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b2.setText("X");
                    }else if (turn == 2){
                        turn = 1;
                        b2.setText("O");
                    }
                }
                endgame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(b3.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b3.setText("X");
                    }else if (turn == 2){
                        turn = 1;
                        b3.setText("O");
                    }
                }
                endgame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(b4.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b4.setText("X");
                    }else if (turn == 2){
                        turn = 1;
                        b4.setText("O");
                    }
                }
                endgame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(b5.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b5.setText("X");
                    }else if (turn == 2){
                        turn = 1;
                        b5.setText("O");
                    }
                }
                endgame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(b6.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b6.setText("X");
                    }else if (turn == 2){
                        turn = 1;
                        b6.setText("O");
                    }
                }
                endgame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(b7.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b7.setText("X");
                    }else if (turn == 2){
                        turn = 1;
                        b7.setText("O");
                    }
                }
                endgame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(b8.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b8.setText("X");
                    }else if (turn == 2){
                        turn = 1;
                        b8.setText("O");
                    }
                }
                endgame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(b9.getText().toString().equals("")){
                    if(turn == 1){
                        turn = 2;
                        b9.setText("X");
                    }else if (turn == 2){
                        turn = 1;
                        b9.setText("O");
                    }
                }
                endgame();
            }
        });
    }
    public void loser(){
        Intent i = new Intent(this,losepage.class);
        this.startActivity(i);
    }
    public void winner(){
        Intent i = new Intent(this,winpage.class);
        this.startActivity(i);
    }

    public void checkWin(int keepUser, int keepCom){

        if(keepUser==3){
            winner();
            end = true;
        }else if(keepCom == 3){
            loser();
            end = true;
        }
    }
    public void reset(int a){
        if(a == 1){
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

        }
    }
    public void endgame(){
        String a,b,c,d,e,f,g,h,i;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();

        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();

        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        //can't check out player(don't have winner)
        //X
        if((a.equals("X") || a.equals("O")) && (b.equals("X") || b.equals("O")) && (c.equals("X") || c.equals("O")) && (d.equals("X") || d.equals("O")) && (e.equals("X") || e.equals("O")) && (f.equals("X") || f.equals("O")) && (g.equals("X") || g.equals("O")) && (h.equals("X") || h.equals("O")) && (i.equals("X") || i.equals("O"))) {
            Toast.makeText(xofight.this, "Draw", Toast.LENGTH_SHORT).show();
            reset(1); //code by Paweewat Tadsuksuwan
        } if (a.equals("X") && b.equals("X") && c.equals("X")) {
                Toast.makeText(xofight.this, "Winner Player x", Toast.LENGTH_LONG).show();
                XScore++;
                green.setText(Integer.toString(XScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (a.equals("X") && e.equals("X") && i.equals("X")) {
                Toast.makeText(xofight.this, "Winner Player x", Toast.LENGTH_LONG).show();
                XScore++;
                green.setText(Integer.toString(XScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (a.equals("X") && d.equals("X") && g.equals("X")) {
                Toast.makeText(xofight.this, "Winner Player x", Toast.LENGTH_LONG).show();
                XScore++;
                green.setText(Integer.toString(XScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (b.equals("X") && e.equals("X") && h.equals("X")) {
                Toast.makeText(xofight.this, "Winner Player x", Toast.LENGTH_LONG).show();
                XScore++;
                green.setText(Integer.toString(XScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (c.equals("X") && f.equals("X") && i.equals("X")) {
                Toast.makeText(xofight.this, "Winner Player x", Toast.LENGTH_LONG).show();
                XScore++;
                green.setText(Integer.toString(XScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (d.equals("X") && e.equals("X") && f.equals("X")) {
                Toast.makeText(xofight.this, "Winner Player x", Toast.LENGTH_LONG).show();
                XScore++;
                green.setText(Integer.toString(XScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (g.equals("X") && h.equals("X") && i.equals("X")) {
                Toast.makeText(xofight.this, "Winner Player x", Toast.LENGTH_LONG).show();
                XScore++;
                green.setText(Integer.toString(XScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (g.equals("X") && e.equals("X") && c.equals("X")) {
                Toast.makeText(xofight.this, "Winner Player X", Toast.LENGTH_LONG).show();
                XScore++;
                green.setText(Integer.toString(XScore));
                reset(1);
                checkWin(XScore, OScore);
            }

            //O
            if (a.equals("O") && b.equals("O") && c.equals("O")) {
                Toast.makeText(xofight.this, "Winner Player O", Toast.LENGTH_LONG).show();
                OScore++;
                som.setText(Integer.toString(OScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (a.equals("O") && e.equals("O") && i.equals("O")) {
                Toast.makeText(xofight.this, "Winner Player O", Toast.LENGTH_LONG).show();
                OScore++;
                som.setText(Integer.toString(OScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (a.equals("O") && d.equals("O") && g.equals("O")) {
                Toast.makeText(xofight.this, "Winner Player O", Toast.LENGTH_LONG).show();
                OScore++;
                som.setText(Integer.toString(OScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (b.equals("O") && e.equals("O") && h.equals("O")) {
                Toast.makeText(xofight.this, "Winner Player O", Toast.LENGTH_LONG).show();
                OScore++;
                som.setText(Integer.toString(OScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (c.equals("O") && f.equals("O") && i.equals("O")) {
                Toast.makeText(xofight.this, "Winner Player O", Toast.LENGTH_LONG).show();
                OScore++;
                som.setText(Integer.toString(OScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (d.equals("O") && e.equals("O") && f.equals("O")) {
                Toast.makeText(xofight.this, "Winner Player O", Toast.LENGTH_LONG).show();
                OScore++;
                som.setText(Integer.toString(OScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (g.equals("O") && h.equals("O") && i.equals("O")) {
                Toast.makeText(xofight.this, "Winner Player O", Toast.LENGTH_LONG).show();
                OScore++;
                som.setText(Integer.toString(OScore));
                reset(1);
                checkWin(XScore, OScore);
            }
            if (g.equals("O") && e.equals("O") && c.equals("O")) {
                Toast.makeText(xofight.this, "Winner Player O", Toast.LENGTH_LONG).show();
                OScore++;
                som.setText(Integer.toString(OScore));
                reset(1);
                checkWin(XScore, OScore);
            }

        if(end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }
    public void back(View view){
        Intent in = new Intent(this,MainActivity.class);
        this.startActivity(in);
    }
}
