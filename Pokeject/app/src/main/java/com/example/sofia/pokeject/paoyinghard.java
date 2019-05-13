package com.example.sofia.pokeject;

import android.app.Activity;
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

public class paoyinghard extends AppCompatActivity {
    private ImageButton fire, water, green, back,wind,power,earth;
    private ImageView left, right,checkUser1, checkUser2, checkUser3, checkCom1, checkCom2, checkCom3;
    private TextView player, com, allSCHard;
    int HumanScore, ComScore,allHard;
    int winUse ,winCom ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paoyinghard);
        back = (ImageButton) findViewById(R.id.imnbBackHard);

        fire = (ImageButton) findViewById(R.id.btnHardFire);
        water = (ImageButton) findViewById(R.id.btnHardWater);
        green = (ImageButton) findViewById(R.id.btnHardGreen);
        wind = (ImageButton) findViewById(R.id.btnHardWind);
        power = (ImageButton) findViewById(R.id.btnHardPower);
        earth = (ImageButton) findViewById(R.id.btnHardEarth);

        left = (ImageView) findViewById(R.id.ballLeftHard);
        right = (ImageView) findViewById(R.id.ballRightHard);
        checkUser1 = (ImageView) findViewById(R.id.checkwinUserHard1);
        checkUser2 = (ImageView) findViewById(R.id.checkwinUserHard2);
        checkUser3 = (ImageView) findViewById(R.id.checkwinUserHard3);
        checkCom1 = (ImageView) findViewById(R.id.checkwinComHard1);
        checkCom2 = (ImageView) findViewById(R.id.checkwinComHard2);
        checkCom3 = (ImageView) findViewById(R.id.checkwinComHard3);

        player = (TextView) findViewById(R.id.txtScoreUserHard);
        com = (TextView) findViewById(R.id.txtScoreComHard);
        allSCHard = (TextView) findViewById(R.id.allHard);
    }
    public void back(View view){
        Intent in = new Intent(this,selectstage.class);
        this.startActivity(in);
    }
    public void fireClick(View view) {
        left.setImageResource(R.drawable.fire);
        String message = play_turn("fire");
        Toast.makeText(paoyinghard.this, message, Toast.LENGTH_SHORT).show();
        player.setText(Integer.toString(HumanScore));
        com.setText(Integer.toString(ComScore));
    }

    public void waterClick(View view) {
        left.setImageResource(R.drawable.seni);
        String message = play_turn("water");
        Toast.makeText(paoyinghard.this, message, Toast.LENGTH_SHORT).show();
        player.setText(Integer.toString(HumanScore));
        com.setText(Integer.toString(ComScore));
    }

    public void greenClick(View view) {
        left.setImageResource(R.drawable.green);
        String message = play_turn("green");
        Toast.makeText(paoyinghard.this, message, Toast.LENGTH_SHORT).show();
        player.setText(Integer.toString(HumanScore));
        com.setText(Integer.toString(ComScore));
    }
    public void windClick(View view) {
        left.setImageResource(R.drawable.pigeon);
        String message = play_turn("green");
        Toast.makeText(paoyinghard.this, message, Toast.LENGTH_SHORT).show();
        player.setText(Integer.toString(HumanScore));
        com.setText(Integer.toString(ComScore));
    }
    public void powerClick(View view) {
        left.setImageResource(R.drawable.pikachu);
        String message = play_turn("green");
        Toast.makeText(paoyinghard.this, message, Toast.LENGTH_SHORT).show();
        player.setText(Integer.toString(HumanScore));
        com.setText(Integer.toString(ComScore));
    }
    public void earthClick(View view) {
        left.setImageResource(R.drawable.iwark);
        String message = play_turn("green");
        Toast.makeText(paoyinghard.this, message, Toast.LENGTH_SHORT).show();
        player.setText(Integer.toString(HumanScore));
        com.setText(Integer.toString(ComScore));
    }

    public void dialogBox2() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("เงอะ แพ้อ่ะ กากจัง!");
        alertDialogBuilder.setPositiveButton("ไปกรอกคะแนน",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        sent();
                    }
                });

        alertDialogBuilder.setNegativeButton("ไม่อยากกรอกคะแนนอ่ะ",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent in = new Intent(paoyinghard.this, selectstage.class);
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
                        sent();
                    }
                });

        alertDialogBuilder.setNegativeButton("ไม่อยากกรอกคะแนนอ่ะ",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent in = new Intent(paoyinghard.this, selectstage.class);
                        startActivity(in);
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void checkWin(int keepUser, int keepCom){

        if(keepUser==10){
            if(keepUser==10 && winUse==0){
                checkUser1.setImageResource(R.drawable.colorball);
                allHard = 10;
                HumanScore = 0;
                ComScore = 0;
                winUse++ ;
            }else if(keepUser==10 && winUse==1){
                checkUser2.setImageResource(R.drawable.colorball);
                allHard = 20;
                HumanScore = 0;
                ComScore = 0;
                winUse++;
            }else if(keepUser==10 && winUse==2){
                checkUser3.setImageResource(R.drawable.colorball);
                allHard = 30;
                HumanScore = 0;
                ComScore = 0;
                /*Intent in = new Intent(this, winpage.class);
                this.startActivity(in);*/
                allSCHard.setText(Integer.toString(allHard));
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
                /*Intent in = new Intent(this, losepage.class);
                this.startActivity(in);*/
                allSCHard.setText(Integer.toString(allHard));
                dialogBox2();
            }
        }
    }
    public void sent(){
        String getit = this.allSCHard.getText().toString();
        Intent in = new Intent(this, addmehard.class);
        in.putExtra("Score",getit);
        this.startActivity(in);
    }

    public String play_turn(String play_choice) {
        String com = "";
        Random r = new Random();

        //choose 1 2 3
        int com_number = r.nextInt(6) + 1;
        if (com_number == 1) {
            com = "fire";
        }else if (com_number == 2) {
            com = "water";
        } else if (com_number == 3) {
            com = "green";
        } else if (com_number == 4) {
            com = "wind";
        } else if (com_number == 5) {
            com = "power";
        } else if (com_number == 6) {
            com = "earth";
        }

        //com show pokemon
        if (com == "fire") {
            right.setImageResource(R.drawable.fire);
        } else if (com == "water") {
            right.setImageResource(R.drawable.seni);
        } else if (com == "green") {
            right.setImageResource(R.drawable.green);
        }else if (com == "wind") {
            right.setImageResource(R.drawable.pigeon);
        }else if (com == "power") {
            right.setImageResource(R.drawable.pikachu);
        }else if (com == "earth") {
            right.setImageResource(R.drawable.iwark);
        }

        //checkfight
        //Human win
        if (com == play_choice) {
            return "เสมอจ้า";
        }else if (play_choice == "fire" && com == "green") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "ไฟเผาใบไม้ได้เฮ้ย คุณชนะ!";
        }else if (play_choice == "fire" && com == "wind") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "ลมสามารถเป่ให้ไฟลุกลามได้ คุณชนะ!";
        }else if (play_choice == "water" && com == "fire") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "น้ำดับไฟได้ เย้ คุณชนะ!";
        }else if (play_choice == "water" && com == "earth") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "น้ำมันกัดเซาะดินได้ ว้ายย~ คุณชนะ!";
        }else if (play_choice == "green" && com == "water") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "น้ำทำให้ต้นไม้โตได้ไงเพื่อน~ คุณชนะ!";
        }else if (play_choice == "green" && com == "earth") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "ต้นไม้โโตได้ด้วยดินหมือนกันนะ คุณชนะ!";
        }else if (play_choice == "earth" && com == "power") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "ดินสามารถซึมซับไฟฟ้าได้ คุณชนะ!";
        }else if (play_choice == "earth" && com == "fire") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "ไฟทำไรฉันไม่ได้หรอกนะ คุณชนะ!";
        }else if (play_choice == "power" && com == "water") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "พลังของฉันจะยิ่งเพิ่มขึ้นเมื่อเจอน้ำ! คุณชนะ!";
        }else if (play_choice == "power" && com == "wind") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "แค่ลมน่ะ ทำอะไรเราไม่ได้หรอก! คุณชนะ!";
        }else if (play_choice == "wind" && com == "green") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "ใบไม้เล็กๆยังงั้นจะพัดให้กระเด็นเลย คุณชนะ!";
        }else if (play_choice == "wind" && com == "earth") {
            HumanScore++;
            checkWin(HumanScore,ComScore);
            return "แค่เศษหินแค่นี้ หลบได้อยุ่แล้ว คุณชนะ!";

            //com win

        }else if (play_choice == "fire" && com == "water") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "โดนน้ำดับหมดเลย แพ้ซะละ";
        }else if (play_choice == "fire" && com == "earth") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "ไฟทำไรไม่ได้เลย แพ้ซะละ";
        }else if (play_choice == "water" && com == "power") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "น้ำมันเป็นสื่อนำไฟฟ้านี่! แพ้ซะละ";
        }else if (play_choice == "water" && com == "green") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "น้ำมีแต่ทำให้ต้นไม้สดชื่น เฮ้อ~ แพ้ซะละ";
        }else if (play_choice == "green" && com == "fire") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "โดนไฟเผาหมดเลย แพ้ซะละ";
        }else if (play_choice == "green" && com == "wind") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "ใบไม้ของฉันโดนลมพัดปลิวไปหมด แพ้ซะละ";
        }else if (play_choice == "earth" && com == "water") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "น้ำกัดเซาะเราหมดแล้ว แพ้ซะละ";
        }else if (play_choice == "earth" && com == "wind") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "ไม่ชอบลมเลย แพ้ซะละ";
        }else if (play_choice == "power" && com == "earth") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "ไฟฟ้าทำอะไรไม่ได้เลยหรอเนี่ย! แพ้ซะละ";
        }else if (play_choice == "power" && com == "green") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "ไม่นะ! แพ้ซะละ";
        }else if (play_choice == "wind" && com == "power") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "ไฟฟ้ามันแข็งแกร่งเกินไป แพ้ซะละ";
        }else if (play_choice == "wind" && com == "fire") {
            ComScore++;
            checkWin(HumanScore,ComScore);
            return "ไฟนั่นร้อนจริงๆ แพ้ซะละ";
        }else return "ใครชนะง่ะ?";

    }
}
