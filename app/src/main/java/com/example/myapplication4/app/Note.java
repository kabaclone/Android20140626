package com.example.myapplication4.app;

/**
 * Created by kabaclone on 14/06/26.
 */
public class Note {
    protected int id;
    protected String note;
    protected String lastupdate;

    public Note(int id, String note, String lastupdate){
        this.id = id;
        this.note = note;
        this.lastupdate = lastupdate;
    }

    public String getNote(){
        return note;
    }

    public String getLastupdate(){
        return lastupdate;
    }

    public int getId(){
        return id;
    }

}
