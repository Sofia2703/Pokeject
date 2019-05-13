package com.example.sofia.pokeject.listHard;

import com.google.gson.annotations.SerializedName;

public class item {
    @SerializedName("Nameh")
    private String Name;
    @SerializedName("PaoHard")
    private String Score;
    public item(String Name, String Score) {
        this.Name = Name;
        this.Score = Score;
    }
    public String getName() {
        return Name;               }
    public String getScore() {
        return Score;         }
}
