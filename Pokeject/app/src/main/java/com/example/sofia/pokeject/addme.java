package com.example.sofia.pokeject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class addme extends AppCompatActivity {
    Button backbtn,save;
    TextView scoreNow;
    ImageButton clear;
    AutoCompleteTextView name;
    //ToggleButton toggle;
    String nameST,sc;
    private static final String URL = "https://flr-3214.000webhostapp.com/Ject/addme.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addme);

        backbtn = (Button) findViewById(R.id.btnCancel);
        scoreNow = (TextView) findViewById(R.id.MyScore);
        save = (Button) findViewById(R.id.btnSaveHard);
        clear = (ImageButton) findViewById(R.id.btnclear);
        name = (AutoCompleteTextView) findViewById(R.id.inputNameHard);
        //toggle = (ToggleButton) findViewById(R.id.toggleButton);

        Intent in = this.getIntent();
        this.sc = in.getStringExtra("Score");
        scoreNow.setText(sc);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(addme.this,selectstage.class);
                startActivity(in);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onEditText();
                onButtonClick();
            }
        });
    }
    public void back(){
        Intent in = new Intent(this,MainActivity.class);
        this.startActivity(in);
    }

   /* public void addEa(){
        Intent in = new Intent(this,selectstage.class);
        this.startActivity(in);
    }*/


    private  void onEditText(){
        nameST = name.getText().toString();
        if (nameST.isEmpty()){
            Toast.makeText(getApplication(), "กรุณากรอกชื่อ", Toast.LENGTH_SHORT).show();
        }
    }


    private  void onButtonClick(){
        if(!nameST.isEmpty()){
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.d("onResponse",response);
                    name.setText("");
                    Toast.makeText(addme.this,"เสร็จแล้ว",Toast.LENGTH_SHORT).show();

                    back();

                }
            }, new Response.ErrorListener(){


                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.d("onError",error.toString());
                    Toast.makeText(addme.this,"เงอะ เออเร่ออ่ะ ลองใหม่เด๊ะ",Toast.LENGTH_SHORT).show();
                }
            }){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String,String> params = new HashMap<String,String>();
                    params.put("Namee",nameST);
                    params.put("PaoEasy",sc);
                    return params;
                }
            };
            requestQueue.add(request);
        }
    }

}
