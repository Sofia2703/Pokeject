package com.example.sofia.pokeject.listHard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sofia.pokeject.R;

import java.util.List;

public class Adap extends RecyclerView.Adapter<Holders> {
    private List<item> itemList;
    private Context context;
    public Adap(Context context, List<item> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public Holders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listja, null);
        Holders rcv = new Holders(layoutView);
        return rcv;
    }
    @Override
    public void onBindViewHolder(Holders holder, int position) {
        holder.name.setText(itemList.get(position).getName());
        holder.score.setText(itemList.get(position).getScore());
    }
    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}

