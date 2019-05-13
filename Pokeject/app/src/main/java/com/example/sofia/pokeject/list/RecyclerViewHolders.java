package com.example.sofia.pokeject.list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sofia.pokeject.R;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView name;
    public TextView score;
    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        name = (TextView)itemView.findViewById(R.id.tv_name);
        score = (TextView)itemView.findViewById(R.id.tv_score);
    }
    @Override
    public void onClick(View view) {
        int position = getAdapterPosition();
        Toast.makeText(view.getContext(), "You clicked an item " + position, Toast.LENGTH_LONG).show();
    }
}

