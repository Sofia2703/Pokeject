package com.example.sofia.pokeject;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by Sofia on 3/12/2560.
 */

public class BackgroundWorker extends AsyncTask <String, Void, Void> {
    Context context;

    BackgroundWorker (Context ctx) {
        context = ctx;
    }
    @Override
    protected Void doInBackground(String... params) {
        String type = params[0];
        //String login_url = https://flr-3214.000webhostapp.com/
        if(type.equals("login")){

        }
        return null;
    }

    protected void onPreExecute(){
        super.onPreExecute();
    }

    protected void onPostExecute(Void aVoid){
        super.onPostExecute(aVoid);
    }

    protected void onProgressUpdate(Void... values){
        super.onProgressUpdate(values);
    }

}
