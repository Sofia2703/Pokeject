package com.example.sofia.pokeject;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class PaoyingPage extends AppCompatActivity {
    private ImageButton fire, water, green, back;
    private ImageView left, right, checkUser1, checkUser2, checkUser3, checkCom1, checkCom2, checkCom3;
    private TextView player, com, allSC;
    int HumanScore, ComScore,all;
    int winUse ,winCom ;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paoying_page);

        fire = (ImageButton) findViewById(R.id.imbtnFire);
        water = (ImageButton) findViewById(R.id.imbtnWater);
        green = (ImageButton) findViewById(R.id.imbtnGreen);
        back = (ImageButton) findViewById(R.id.btnBackPao);


        left = (ImageView) findViewById(R.id.ballLeft);
        right = (ImageView) findViewById(R.id.ballRight);
        checkUser1 = (ImageView) findViewById(R.id.checkwinUser1);
        checkUser2 = (ImageView) findViewById(R.id.checkwinUser2);
        checkUser3 = (ImageView) findViewById(R.id.checkwinUser3);
        checkCom1 = (ImageView) findViewById(R.id.checkwinCom1);
        checkCom2 = (ImageView) findViewById(R.id.checkwinCom2);
        checkCom3 = (ImageView) findViewById(R.id.checkwinCom3);

        player = (TextView) findViewById(R.id.txtScoreUser);
        com = (TextView) findViewById(R.id.txtScoreCom);
        allSC = (TextView) findViewById(R.id.allScore);

    }

    public void back(View view) {
        Intent in = new Intent(this, selectstage.class);
        this.startActivity(in);
    }

    public void fireClick(View view) {
        left.setImageResource(R.drawable.fire);
        String message = play_turn("fire");
        Toast.makeText(PaoyingPage.this, message, Toast.LENGTH_SHORT).show();
        player.setText(Integer.toString(HumanScore));
        com.setText(Integer.toString(ComScore));

    }

    public void waterClick(View view) {
        left.setImageResource(R.drawable.seni);
        String message = play_turn("water");
        Toast.makeText(PaoyingPage.this, message, Toast.LENGTH_SHORT).show();
        player.setText(Integer.toString(HumanScore));
        com.setText(Integer.toString(ComScore));
    }

    public void greenClick(View view) {
        left.setImageResource(R.drawable.green);
        String message = play_turn("green");
        Toast.makeText(PaoyingPage.this, message, Toast.LENGTH_SHORT).show();
        player.setText(Integer.toString(HumanScore));
        com.setText(Integer.toString(ComScore));

    }
    public void checkWin(int keepUser, int keepCom){

        if(keepUser==10){
            if(keepUser==10 && winUse==0){
                checkUser1.setImageResource(R.drawable.colorball);
                all = 10;
                HumanScore = 0;
                ComScore = 0;
                winUse++ ;
            }else if(keepUser==10 && winUse==1){
                checkUser2.setImageResource(R.drawable.colorball);
                all = 20;
                HumanScore = 0;
                ComScore = 0;
                winUse++;
            }else if(keepUser==10 && winUse==2){
                checkUser3.setImageResource(R.drawable.colorball);
                all = 30;
                HumanScore = 0;
                ComScore = 0;
                allSC.setText(Integer.toString(all));
                dialogBox();


            }
        }else if(keepCom == 10){
            if(keepCom==10 && winCom==0){
                checkCom1.setImageResource(R.drawable.colorball);
                HumanScore = 0;
                ComScore = 0;
                winCom++ ;
            }else if(keepCom==10 && winCom==1){
                checkCom2.setImageResource(R.drawable.colorball);
                HumanScore = 0;
                ComScore = 0;
                winCom++;
            }else if(keepCom==10 && winCom==2){
                checkCom3.setImageResource(R.drawable.colorball);
                HumanScore = 0;
                ComScore = 0;
                allSC.setText(Integer.toString(all));
                dialogBox2();

            }
        }
    }
    public void dialogBox2() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("เงอะ แพ้อ่ะ กากจัง!");
        alertDialogBuilder.setPositiveButton("ไปกรอกคะแนน",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        sentText();
                    }
                });

        alertDialogBuilder.setNegativeButton("ไม่อยากกรอกคะแนนอ่ะ",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent in = new Intent(PaoyingPage.this, selectstage.class);
                        startActivity(in);
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void dialogBox() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("ชนะละเว้ย!");
        alertDialogBuilder.setPositiveButton("ไปกรอกคะแนน",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        sentText();
                    }
                });

        alertDialogBuilder.setNegativeButton("ไม่อยากกรอกคะแนนอ่ะ",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent in = new Intent(PaoyingPage.this, selectstage.class);
                        startActivity(in);
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void sentText(){
        String getit = this.allSC.getText().toString();
        Intent in = new Intent(this, addme.class);
        in.putExtra("Score",getit);
        this.startActivity(in);
    }

    public String play_turn(String play_choice) {
        String com = "";
        Random r = new Random();


        //choose 1 2 3
        int com_number = r.nextInt(3) + 1;
        if (com_number == 1) {
            com = "fire";
        } else if (com_number == 2) {
            com = "water";
        } else if (com_number == 3) {
            com = "green";
        }

        //com show pokemon
        if (com == "fire") {
            right.setImageResource(R.drawable.fire);
        } else if (com == "water") {
            right.setImageResource(R.drawable.seni);
        } else if (com == "green") {
            right.setImageResource(R.drawable.green);
        }

        //Human win
        if (com == play_choice) {
            return "เสมอจ้า";
        }else if (play_choice == "fire" && com == "green") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "ไฟเผาใบไม้ได้เฮ้ย คุณชนะ!";
        }else if (play_choice == "water" && com == "fire") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "น้ำดับไฟได้ เย้ คุณชนะ!";
        }else if (play_choice == "green" && com == "water") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "น้ำทำให้ต้นไม้โตได้ไงเพื่อน~ คุณชนะ!";

        //com win
        }else if (play_choice == "green" && com == "fire") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "โดนไฟเผาหมดเลย แพ้ซะละ";
        }else if (play_choice == "fire" && com == "water") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "โดนน้ำดับหมดเลย แพ้ซะละ";
        }else if (play_choice == "water" && com == "green") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "น้ำมีแต่ทำให้ต้นไม้สดชื่น เฮ้อ~ แพ้ซะละ";
        }else return "ใครชนะกันอ่ะ?";
    }

}
