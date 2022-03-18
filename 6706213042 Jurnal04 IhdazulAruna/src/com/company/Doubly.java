package com.company;

public class Doubly {
    //Kita buat Private string untuk input data yang akan kita masukkan dan olah
    private String title;

    private String singer;

    public Doubly(String title, String singer){
        this.title = title;
        this.singer = singer;
    }
    //Buat datanya menjadi string supaya kita bisa ambil
    public String gettitle(){
        return this.title;
    }

    @Override
    public String toString(){
        return this.title;
    }
}

