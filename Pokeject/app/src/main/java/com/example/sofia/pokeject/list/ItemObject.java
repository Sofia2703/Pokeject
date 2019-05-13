package com.example.sofia.pokeject.list;

import com.google.gson.annotations.SerializedName;

public class ItemObject {
    @SerializedName("Namee")
    private String Name;
    @SerializedName("PaoEasy")
    private String Score;
    public ItemObject(String Name, String Score) {
        this.Name = Name;
        this.Score = Score;
    }
    public String getName() {
        return Name;               }
    public String getScore() {
        return Score;         }
}
