package com.company;

public class PlayList {
    private String judul;
    private String penyanyi;

    public PlayList(String judul, String penyanyi){
        this.judul = judul;
        this.penyanyi = penyanyi;
    }

    public String getJudul(){
        return judul;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "judul='" + judul + '\'' +
                ", penyanyi='" + penyanyi + '\'' +
                '}';
    }
}
