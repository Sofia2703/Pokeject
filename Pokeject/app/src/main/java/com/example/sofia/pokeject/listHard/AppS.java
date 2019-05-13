package com.example.sofia.pokeject.listHard;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class AppS {
    private static AppS mAppSInstance;
    private RequestQueue mRequestQueue;
    private static Context mContext;
    private AppS(Context context) {
        mContext = context;
        mRequestQueue = getRequestQueue();
    }
    public static synchronized AppS getInstance(Context context) {
        if (mAppSInstance == null) {
            mAppSInstance = new AppS(context);
        }
        return mAppSInstance;      }
    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            // getApplicationContext() is key, it keeps you from leaking the
            // Activity or BroadcastReceiver if someone passes one in.
            mRequestQueue = Volley.newRequestQueue(mContext.getApplicationContext());
        }
        return mRequestQueue;
    }
    public <T> void addToRequestQueue(Request<T> req, String tag) {
        req.setTag(tag);
        getRequestQueue().add(req);
    }
}

